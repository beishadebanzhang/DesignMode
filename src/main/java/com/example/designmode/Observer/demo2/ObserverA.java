package com.example.designmode.Observer.demo2;

import lombok.Getter;
import lombok.Setter;

import java.util.Observable;
import java.util.Observer;

@Setter
@Getter
public class ObserverA implements Observer {

    private int state;

    @Override
    public void update(Observable o, Object arg) {
        state = ((ConcreteSubject) o).getState();
    }

}
