package com.example.designmode.Observer.demo1;

import lombok.Data;

@Data
public class ConcreteSubject implements Subject<Observer>{

    private int state;

    public void setState(int state) {
        this.state = state;
        //主题对象(目标对象)值发生了变化，请通知所有的观察者
        this.notifyAllObservers();
    }

    @Override
    public void registerObserver(Observer obs) {
        list.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        list.remove(obs);
    }

    @Override
    public void notifyAllObservers() {
        for (Observer obs : list) {
            // 更新每一个观察者中的信息
            obs.update(this);
        }
    }

}
