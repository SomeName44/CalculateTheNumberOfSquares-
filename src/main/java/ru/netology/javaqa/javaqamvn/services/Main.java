package ru.netology.javaqa.javaqamvn.services;

import ru.netology.javaqa.javaqamvn.services.SQRservice;

public class Main {
    public static void main(String[] args) {
        SQRservice service = new SQRservice();

        int begin = 200;
        int end = 300;
        int count = service.calculate(begin, end);
        System.out.println("Сколько квадратов попало в диапазоне от " + begin + " до " + end + " результат: " + count);

        begin = 115;
        end = 155;
        count = service.calculate(begin, end);
        System.out.println("Сколько квадратов попало в диапазоне от " + begin + " до " + end + " результат: " + count);

        begin = 147;
        end = 177;
        count = service.calculate(begin, end);
        System.out.println("Сколько квадратов попало в диапазоне от " + begin + " до " + end + " результат: " + count);

        begin = 300;
        end = 200;
        count = service.calculate(begin, end);
        System.out.println("Сколько квадратов попало в диапазоне от " + begin + " до " + end + " результат: " + count);
    }


}
