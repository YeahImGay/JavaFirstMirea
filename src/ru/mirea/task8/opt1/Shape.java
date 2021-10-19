package ru.mirea.task8.opt1;

public abstract class Shape {
    protected String colour;
    protected boolean filled;
    protected int x;
    protected int y;
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public Shape(){
        colour = "black";
        filled = true;
    }
    public Shape(String Colour, boolean Filled, int X, int Y){
        colour = Colour;
        filled = Filled;
        x = X;
        y = Y;
    }
    public String getColour(){
        return colour;
    }
    public void setColour(String Colour){
        colour = Colour;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean Filled){
        filled = Filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}

class Circle extends Shape{
    protected double radius;
    public Circle(){
        radius = 1;
        colour = "black";
        filled = true;
    }
    public Circle(double Radius, String Colour, boolean Filled, int X, int Y){
        radius = Radius;
        colour = Colour;
        filled = Filled;
        x = X;
        y = Y;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double Radius){
        radius = Radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    };
    public double getPerimeter(){
        return 2*Math.PI*radius;
    };
    public String toString(){
        return "Circle{Radius: "+getRadius()+", Colour: "+getColour()+", Filled: "+isFilled()+"}";
    };
}

class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle(){
        width = 1;
        length = 2;
        colour = "black";
        filled = true;
    }
    public Rectangle(double Width, double Length){
        width = Width;
        length = Length;
        colour = "black";
        filled = true;
    }
    public Rectangle(double Width, double Length, String Colour, boolean Filled, int X, int Y){
        width = Width;
        length = Length;
        colour = Colour;
        filled = Filled;
        x = X;
        y = Y;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double Width){
        width = Width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double Length){
        length = Length;
    }
    public double getArea(){
        return width*length;
    };
    public double getPerimeter(){
        return 2*(width+length);
    };
    public String toString(){
        return "Rectangle{Width: "+getWidth()+", Length: "+getLength()+", Colour: "+getColour()+", Filled: "+isFilled()+"}";
    };
}

class Square extends Rectangle{
    public Square(){
        width = 1;
        length = 1;
        colour = "black";
        filled = true;
    }
    public Square(double Side){
        width = Side;
        length = Side;
        colour = "black";
        filled = true;
    }
    public Square(double Side, String Colour, boolean Filled, int X, int Y){
        width = Side;
        length = Side;
        colour = Colour;
        filled = Filled;
        x = X;
        y = Y;
    }
    public double getSide(){
        return width;
    }
    public void setSide(double Side){
        width = Side;
        length = Side;
    }
    public void setWidth(double Side){
        width = Side;
        length = Side;
    }
    public void setLength(double Side){
        width = Side;
        length = Side;
    }
    public String toString(){
        return "Square{Side: "+getSide()+", Colour: "+getColour()+", Filled: "+isFilled()+"}";
    };
}
