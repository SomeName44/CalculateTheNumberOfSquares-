package ru.netology.javaqa.javaqamvn.services;

public class SQRservice {

    public int calculate(int begin, int end) {

        int count = 0;

        for (int i = 10; i <= 99; i++) {
            int x = i * i;
            if (x >= begin) {
                if (x <= end) {
                    count++;
                }
            }
        }
        return count;
    }

}