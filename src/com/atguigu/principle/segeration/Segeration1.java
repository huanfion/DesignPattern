package com.atguigu.principle.segeration;

/*
接口隔离:
1.客户端不应该依赖它不需要的接口
2.类间的依赖关系应该建立在最小的接口上
 */
public class Segeration1 {
    public static void main(String[] args) {
        A a = new A();
        Interface1 b=new B();
        a.depend1(b);

        C c=new C();
        Interface1 d=new D();
        c.depend3(d);
    }
}
/*
接口Interface1有五个方法，类B和D分别实现了Interface1中的5个方法
类A 通过接口Interface1 依赖B类，但只用到了1,2,3方法
类C 通过接口Interface1依赖D类，但只用到了1,4,5方法
 */

interface Interface1 {
    void opreation1();

    void opreation2();

    void opreation3();

    void opreation4();

    void opreation5();

}

class B implements Interface1 {
    @Override
    public void opreation1() {
        System.out.println("B 实现了方法opreation1");
    }

    @Override
    public void opreation2() {
        System.out.println("B 实现了方法opreation2");
    }

    @Override
    public void opreation3() {
        System.out.println("B 实现了方法opreation3");
    }

    @Override
    public void opreation4() {
        System.out.println("B 实现了方法opreation4");
    }

    @Override
    public void opreation5() {
        System.out.println("B 实现了方法opreation5");
    }
}

class D implements Interface1 {
    @Override
    public void opreation1() {
        System.out.println("D 实现了方法opreation1");
    }

    @Override
    public void opreation2() {
        System.out.println("D 实现了方法opreation2");
    }

    @Override
    public void opreation3() {
        System.out.println("D 实现了方法opreation3");
    }

    @Override
    public void opreation4() {
        System.out.println("D 实现了方法opreation4");
    }

    @Override
    public void opreation5() {
        System.out.println("D 实现了方法opreation5");
    }
}

class A {
    public void depend1(Interface1 i) {
        i.opreation1();
    }

    public void depend2(Interface1 i) {
        i.opreation2();
    }

    public void depend3(Interface1 i) {
        i.opreation3();
    }
}

class C {
    public void depend1(Interface1 i) {
        i.opreation1();
    }

    public void depend2(Interface1 i) {
        i.opreation4();
    }

    public void depend3(Interface1 i) {
        i.opreation5();
    }
}