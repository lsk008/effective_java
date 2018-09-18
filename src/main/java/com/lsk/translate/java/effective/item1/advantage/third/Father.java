package com.lsk.translate.java.effective.item1.advantage.third;


public class Father {
    /**
     * 构造方法只能返回Father类型
     */
    public Father(){ }
    /**
     * 静态工厂方法可以返回该对象类型或子类对象
     */
    public static Father getInstance(Boolean isFather){
        if(isFather){
            return new Father();
        }
        return new Son();
    }
}
