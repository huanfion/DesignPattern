package com.atguigu.principle.DI;

/**
 * 依赖倒置原则
 * 1）：高层模块不应该依赖底层模块，应该依赖其抽象
 * 2）：抽象不应该依赖细节，细节应该依赖于抽象
 * 3）：依赖倒置的中心思想是面向接口编程
 * <p>
 * 依赖倒置的设计理念：相对于细节的多变性，抽象的东西更加稳定。以抽象搭建的架构比以细节为基础的架构更加稳定。
 * 抽象指的是接口和抽象类，细节是指的实现类。
 */
public class DependenceInversion1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        //新增微信类，
        person.receive(new Wechat());
    }
}

//方式1：完成一个person 接收消息的功能
// 如果我们新增需求，需要接收微信，qq，短信等等多种消息，我们则必须新增对应的类，并且在Person中新增方法
class Person {
    public void receive(Email email) {
        System.out.printf(email.getInfo());
    }
    public void receive(Wechat wechat){
        System.out.printf(wechat.getInfo());
    }
}

class Email {
    public String getInfo() {
        return "电子邮件信息：hello world.";
    }
}

class Wechat{
    public String getInfo(){
        return "微信信息：hello world.";
    }
}