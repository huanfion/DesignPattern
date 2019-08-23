package com.atguigu.principle.ocp;

import java.awt.*;

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

/**
 * 违背了开闭原则，即对扩展开放（提供方），对修改关闭（使用方）
 * 比如我们新增一个三角形，就需要修改GraphicEditor
 */
class GraphicEditor{
    //根据不同的shape对象绘制不同的图形
    public void drawShape(Shape shape){
        if(shape.getType()==1){
            drawRectangle(shape);
        }
        else if(shape.getType()==2){
            drawCircle(shape);
        }
        else if(shape.getType()==3){
            drawTriangle(shape);
        }
    }

    private void drawTriangle(Shape shape) {
        System.out.println("三角形");
    }

    private void drawCircle(Shape shape) {
        System.out.println("圆形");
    }

    private void drawRectangle(Shape shape) {
        System.out.println("矩形");
    }
}
class Shape{
    private int type;

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }
}
class Rectangle extends Shape{
    public Rectangle() {
        super.setType(1);
    }
}
class Circle extends Shape{
    public Circle() {
        super.setType(2);
    }
}
//新增一个三角形
class  Triangle extends Shape {
    public Triangle() {
        super.setType(3);
    }
}