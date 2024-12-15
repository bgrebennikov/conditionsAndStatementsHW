package com.github.bgrebennikovv;

final class OS{
    public static final int IOS = 0;
    public static final int ANDROID = 1;
}


public class Main {
    public static void main(String[] args) {


        // Task 1
        int clientOS = OS.IOS; // 0 - IOS 1 - Android
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }



    }
}