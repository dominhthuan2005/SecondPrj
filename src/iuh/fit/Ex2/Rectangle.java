package iuh.fit.Ex2;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(){
        this.length = 0.0;
        this.width = 0.0;
    }
    public Rectangle(double length, double width){
        this.setLength(length);
        this.setWidth(width);
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        if(length < 0.0){
            throw new IllegalArgumentException("Length must be greater than 0.");
        }
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        if(width < 0.0){
            throw new IllegalArgumentException("Width must be greater than 0.");
        }
        this.width = width;
    }
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return 2 * length + 2 * width;
    }
}
