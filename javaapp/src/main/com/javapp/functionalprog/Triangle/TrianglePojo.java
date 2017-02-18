package com.javapp.functionalprog.Triangle;

/**
 * java.java.javapp.functionalprog
 * Created by lusinabrian on 14/11/16.
 * Description:
 */
public class TrianglePojo {
    public final int height;
    public final int base;
    private double area;

    public TrianglePojo(int height, int base) {
        this.height = height;
        this.base = base;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double a) {
        area = a;
    }
}