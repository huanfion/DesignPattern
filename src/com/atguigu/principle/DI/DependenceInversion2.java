package com.atguigu.principle.DI;

/**
 * 新建一个IReceiver 接口，Email ,微信，短信都实现该接口
 */
public class DependenceInversion2 {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.receive(new EMail1());
        person1.receive(new Wechat1());
    }
}

interface IReceiver{
    public String getInfo();
}
class Person1{
    //这里依赖的是接口，而不再依赖具体的细节，新增消息类只需新增类即可，不需要修改Person类
    public void receive(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}
class EMail1 implements IReceiver{
    @Override
    public String getInfo() {
        return "电子邮件信息：hello world";
    }
}

class Wechat1 implements IReceiver{
    @Override
    public String getInfo() {
        return "微信信息：hello world.";
    }
}