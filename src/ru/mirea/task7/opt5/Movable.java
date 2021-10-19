package ru.mirea.task7.opt5;

public interface Movable {
    public void moveUp();

    public void moveDown();

    public void moveLeft();

    public void moveRight();
}
class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    public MovablePoint(int X, int Y, int XSpeed, int YSpeed){
        x = X;
        y = Y;
        xSpeed = XSpeed;
        ySpeed = YSpeed;
    }
    public String toString(){
        return "MovablePoint{x: "+x+", y: "+y+", xSpeed: "+xSpeed+", ySpeed: "+ySpeed+"}";
    }
    public void moveUp(){
        y += ySpeed;
    };
    public void moveDown(){
        y -= ySpeed;
    };
    public void moveLeft(){
        x -= xSpeed;
    };
    public void moveRight(){
        x += xSpeed;
    };
}
class MovableCircle extends MovablePoint implements Movable {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int X, int Y, int XSpeed, int YSpeed, int Radius){
        super(X, Y, XSpeed, YSpeed);
        radius = Radius;
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }
    public String toString(){
        return "MovableCircle{"+center+", radius: "+radius+"}";
    }
    public void moveUp(){
        center.moveUp();
    };
    public void moveDown(){
        center.moveDown();
    };
    public void moveLeft(){
        center.moveLeft();
    };
    public void moveRight(){
        center.moveRight();
    };
}
class MovableRectangle extends MovablePoint implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    public MovableRectangle(int x1, int y1, int x2, int y2, int XSpeed, int YSpeed) {
        super(x1, y1, XSpeed, YSpeed);
        topLeft = new MovablePoint(x1, y1, XSpeed, YSpeed);
        bottomRight = new MovablePoint(x2, y2, XSpeed, YSpeed);
    }
    public String toString() {
        return "MovableRectangle{topLeft: "+topLeft+", bottomRight: "+bottomRight+"}";
    }
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}

