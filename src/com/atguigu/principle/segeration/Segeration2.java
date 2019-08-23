package com.atguigu.principle.segeration;

/**
 * 接口分离原则，类间的依赖关系建立在最小接口上
 */
public class Segeration2 {
    public static void main(String[] args) {
        A1 a = new A1();
        Interface2 b=new B1();
        a.depend1(b);

        C1 c=new C1();
        Interface4 d=new D1();
        c.depend3(d);
    }
}

interface Interface2 {
    void operation1();

}

interface Interface3 {
    void operation2();

    void operation3();
}

interface Interface4 {
    void operation4();

    void operation5();
}

class B1 implements Interface3,Interface2{
    @Override
    public void operation1() {
        System.out.println("B 实现了方法opreation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了方法opreation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了方法opreation3");
    }
}

class D1 implements Interface2,Interface4{
    @Override
    public void operation1() {
        System.out.println("D 实现了方法opreation1");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现了方法opreation4");
    }

    @Override
    public void operation5() {
        System.out.println("D 实现了方法opreation1");
    }
}
class A1{
    public void depend1(Interface2 i){
        i.operation1();
    }
    public void depend2(Interface3 i){
        i.operation2();
    }
    public  void depend3(Interface3 i)
    {
        i.operation3();
    }
}

class C1{
    public void denpend1(Interface2 i){
        i.operation1();
    }
    public void depend2(Interface4 i){
        i.operation4();
    }
    public  void depend3(Interface4 i)
    {
        i.operation5();
    }
}