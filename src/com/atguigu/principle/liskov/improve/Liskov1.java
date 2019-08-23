package com.atguigu.principle.liskov.improve;

/**
 * 里氏替换原则 :所有引用基类的地方必须能透明地使用其子类的对象
 * 通俗的讲，就是使用父类的地方，子类可以替换它，并且不影响程序运行
 * 这是一种追求完美的原则
 */
public class Liskov1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));

        System.out.println("------------------------");
        B b = new B();
        System.out.println("11-3=" + b.func1(11, 3));
        System.out.println("1-8=" + b.func1(1, 8));
        System.out.println("11+3+9=" + b.func2(11, 3));

    }
}

//创建一个基础的基类
class Base {
    //把更加基础的方法和成员写到base类
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

class A extends Base {
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}

//B
class B extends Base {
    //如果B想使用A类中的方法，可以使用组合关系来实现
    private A a = new A();

    public int func1(int num1, int num2) {
        return num1 + num2;
    }

    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }

    //仍然使用A中的方法
    public int func3(int a, int b) {
        return this.a.func1(a, b);
    }

}
