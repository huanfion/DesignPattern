package com.atguigu.principle.singleresponsibility;

/*
单一职责的原则和注意事项
1.降低类的复杂性
2.提高类的可读性和复用性
3.降低变更引起的风险
4.只有在逻辑简单的情况下，才可以在代码级违反单一职责原则。
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {

    }
}
/*
相对于修改成3个类，修改Vehicle类中三个方法，实现方法的单一职责，这种方式更加好
当然前提是类中方法足够少，才能使用这种方式
 */
class Vehicle2{
    public void runRoad(String vehicle){
        System.out.println(vehicle+"在马路上跑...");
    }
    public void runAir(String vehicle){
        System.out.println(vehicle+"在天上飞...");
    }
    public void runWater(String vehicle){
        System.out.println(vehicle+"在水里游...");
    }
}