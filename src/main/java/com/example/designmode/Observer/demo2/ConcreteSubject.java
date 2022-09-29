package com.example.designmode.Observer.demo2;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Observable;

@Setter
@Getter
// @Data
//  会重写equals方法, 默认使用非静态/非瞬态的属性,
//  可通过参数 Exclude 排除一些属性,
//  可通过参数 Include 指定使用哪些属性
//  仅使用该类中定义的属性且不调用父类的方法
//  可通过 @EqualsAndHashCode(callSuper=true) 解决上一点问题, 让其生成的方法中调用父类的方法
public class ConcreteSubject extends Observable {

    private int state;

    public void set(int state) {
        this.state = state;
        // 表示目标对象已经做了更改
        setChanged();
        // 通知所有的观察者(以类为单位, 多个相同类的对象, 不会重复通知)
        notifyObservers();
    }

}
