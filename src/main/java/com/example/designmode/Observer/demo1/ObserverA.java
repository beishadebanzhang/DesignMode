package com.example.designmode.Observer.demo1;

import lombok.Data;

@Data
public class ObserverA implements Observer{

    /**
     * 需要与目标对象的state保持一致
     */
    private int state;

    @Override
    public void update(Subject subject) {
        state = ((ConcreteSubject) subject).getState();
    }

}
