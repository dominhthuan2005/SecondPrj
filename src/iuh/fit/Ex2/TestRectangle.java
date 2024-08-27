/*
 * @ Do Minh Thuan.java    1.0 21
 * Copyright (c) 2024 IUH. All rights reserved
 *
 */
package iuh.fit.Ex2;
/*
 * @description:
 * @author: Minh Thuan
 * @date: 28/08/2024
 * @version: 1.0
 */

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(20,50);
        System.out.println("CHieu dai: " + r.getLength());
        System.out.println("Chieu rong: " + r.getWidth());
        System.out.println("Chu vi: " + r.getPerimeter());
        System.out.println("Dien tich: " + r.getArea());
    }
}
