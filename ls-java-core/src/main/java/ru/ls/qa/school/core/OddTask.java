package ru.ls.qa.school.core;

public class OddTask {

    private int n;

    private boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int n = 16;

        OddTask task = new OddTask();
        boolean result = task.isEven(n);

        System.out.println("Число " + n + (result ? " - чётное." : " - нечетное."));
    }
}