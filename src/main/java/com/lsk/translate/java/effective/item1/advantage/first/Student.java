package com.lsk.translate.java.effective.item1.advantage.first;

public class Student {
    private String name;
    private int age;
    //constructor
    public Student(){

    }

    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Student(int age,String name){
        this.name=name;
        this.age=age;
    }
    //static factory method
    public Student createInstance(){
        return new Student();
    }
    public static void main(String[] args) {
        //use constructor to create Student instance
        Student student1=new Student();
        Student student2=new Student("student2",18);
    }
    public static Boolean valueOf(boolean b){
        return b?Boolean.TRUE:Boolean.FALSE;
    }
}
