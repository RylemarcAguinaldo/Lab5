package shape;

abstract class Shape {

    public void draw(Graphics g){
        System.out.println("Drawing");
    }

    abstract double getArea();

    abstract double getBoundingArea();
}
