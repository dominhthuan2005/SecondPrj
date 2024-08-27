package iuh.fit.Ex2;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(20,50);
        System.out.println("CHieu dai: " + r.getLength());
        System.out.println("Chieu rong: " + r.getWidth());
        System.out.println("Chu vi: " + r.getPerimeter());
        System.out.println("Dien tich: " + r.getArea());
    }
}
