package org.example;

interface Shape {
    void draw();
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Triangle");
    }
}

class Cube implements Shape {

    @Override
    public void draw() {
        System.out.println("Cube");
    }
}

class ShapeFactory {
    public Shape getShape(String shape) {
        if (shape.equalsIgnoreCase("circle")) {
            return new Circle();
        }
        if (shape.equalsIgnoreCase("triangle")) {
            return new Triangle();
        }
        if (shape.equalsIgnoreCase("cube")) {
            return new Cube();
        }
        return null;
    }
}

public class FactoryDesignPattern {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Circle c = (Circle) factory.getShape("circle");
        System.out.println(c);

        Cube cb = (Cube) factory.getShape("cube");
        System.out.println(cb);

    }
}
