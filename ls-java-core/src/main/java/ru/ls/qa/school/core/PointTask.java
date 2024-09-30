package ru.ls.qa.school.core;

public class PointTask {
    public static void main(String[] args) {
        Point point1 = new Point(7, 9);
        Point point2 = new Point(0, 0);

        double distance = point1.distance(point2);
        System.out.println("Расстояние между точками: " + distance);
    }
}