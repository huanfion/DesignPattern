package com.atguigu.principle.ocp.improve;

/**
 * 开闭原则
 *
 */
public class OpenClose {
    public static void main(String[] args) {
        GraphicEditor graphicEditor=new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}
//使用方
//新增一个三角形类，使用方不需要修改代码，符合对使用方修改关闭要求
class GraphicEditor{
    //根据不同的shape对象绘制不同的图形
    public void drawShape(Shape shape){
       shape.draw();
    }
}
abstract class Shape{
    abstract void draw();
}
class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("矩形");
    }
}
class Circle extends Shape{


    @Override
    void draw() {
        System.out.println("圆形");
    }
}
//新增一个三角形
class  Triangle extends Shape {


    @Override
    void draw() {
        System.out.println("三角形");
    }
}