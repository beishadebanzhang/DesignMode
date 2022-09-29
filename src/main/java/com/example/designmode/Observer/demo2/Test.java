package com.example.designmode.Observer.demo2;

public class Test {
    public static void main(String[] args) {
        //创建目标对象
        ConcreteSubject subject = new ConcreteSubject();
        subject.set(0);
        //创建观察者
        ObserverA obs1 = new ObserverA();
        ObserverA obs2 = new ObserverA();
        ObserverA obs3 = new ObserverA();
        //将上面三个观察者对象添加到目标对象subject的观察者容器中
        subject.addObserver(obs1);
        subject.addObserver(obs2);
        subject.addObserver(obs3);
        //改变subject对象的状态
        subject.set(3000);
        System.out.println(subject.countObservers());
        //观察者的状态发生了变化
        System.out.println(obs1.getState());
        System.out.println(obs2.getState());
        System.out.println(obs3.getState());
    }
}
