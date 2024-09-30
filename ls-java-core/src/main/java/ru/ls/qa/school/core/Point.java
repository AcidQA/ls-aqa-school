package ru.ls.qa.school.core;

import lombok.Getter;

@Getter
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distance(Point point) {
        double dx = this.x - point.getX();
        double dy = this.y - point.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }
}