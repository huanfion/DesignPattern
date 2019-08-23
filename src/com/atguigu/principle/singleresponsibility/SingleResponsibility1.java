package com.atguigu.principle.singleresponsibility;

interface Vehicle {
    void run(String vehicle);
}

public class SingleResponsibility1 {
    public static void main(String[] args) {
        RoadVehicle vehicle = new RoadVehicle();
        vehicle.run("猪");
        vehicle.run("牛");
        AirVehicle airVehicle=new AirVehicle();
        airVehicle.run("鸟");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("鱼");
    }
}

class RoadVehicle implements Vehicle {
    @Override
    public void run(String vehicle) {
        System.out.println(vehicle + "在地上跑");
    }
}

class AirVehicle implements Vehicle {
    @Override
    public void run(String vehicle) {
        System.out.println(vehicle + "在天上飞");
    }
}

class WaterVehicle implements Vehicle {
    @Override
    public void run(String vehicle) {
        System.out.println(vehicle+"在水里游");
    }
}