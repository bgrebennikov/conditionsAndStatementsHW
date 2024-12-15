package com.github.bgrebennikovv;

final class ClientOS {
    public static final int IOS = 0;
    public static final int ANDROID = 1;
}


public class Main {
    public static void main(String[] args) {


        // Task 1
        int clientOS = ClientOS.IOS; // Это для удобства, сути не меняет. Можно легко ошибиться если использовать только числовые значения!
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Task 2
        int clientDeviceYear = 2015;
        System.out.printf("\nГод выпуска устройства: %s \n", clientDeviceYear);

        switch (clientOS) {
            case ClientOS.IOS:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            case ClientOS.ANDROID:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                break;
        }

        // Task 3

        int year = 2021; // Замените на интересующий вас год

        if (year <= 1584) {
            System.out.println(year + "год меньше или равен 1584 и не может быть високосным по григорианскому календарю.");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

    }
}