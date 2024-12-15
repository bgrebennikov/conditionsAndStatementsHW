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

        // Task 4
        int deliveryDistance = 95;

        int deliveryDays = 0;

        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            System.out.println("\nДоставка невозможна.");
        }

        System.out.printf("""
                Расстояние до клиента: %s
                Потребуется дней: %s
                """, deliveryDistance, deliveryDays);


        // Task 5
        int monthNumber = 12;

        String season;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
            default:
                season = null;
                break;
        }

        if (season != null) {
            System.out.println("Месяц номер " + monthNumber + " принадлежит к сезону: " + season + ".");
        } else {
            System.out.println("Некорректный номер месяца. Введите значение от 1 до 12.");
        }


    }
}