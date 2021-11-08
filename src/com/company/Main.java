
package com.company;

public class Main {
    //метод к задаче 1
    public static void god(int year) {
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " — високосный год");
            }else System.out.println(year + " — не високосный год");
        }
    }
    //метод к задаче 2
    public  static void NewOS(int clientDeviceYear, int telOs, int clientDivice ) {
        if (clientDivice < clientDeviceYear) {
            if (telOs == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else System.out.println("Установите облегченную версию приложения для Android по ссылке");

        }else {
            if (telOs == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    //Метод  к 3 задаче
    public static int  delivery(int deliveryDistance, int dayDost) {

        if (deliveryDistance < 20) {
            dayDost = 1;
        } else dayDost = deliveryDistance / 40;
        System.out.println("Потребуется дней: " + dayDost);

        return  dayDost;
    }
    //метод к 4 задаче
    public static void dable (String stroka) {
        StringBuilder sb = new StringBuilder();
        char[]  st = stroka.toCharArray();
        sb.append(st[0]);
        for (int i = 1; i < st.length; i++) {
            if (st[i - 1] != st[i]) {
                sb.append(st[i]);
            }else{
                System.out.println("Задублирован символ " + st[i]);
                return;}

        }
        System.out.println(sb);
    }
    //метод к задаче 5
    public static void reveseStroka (char[] fullName) {
//        StringBuilder sb = new StringBuilder();
//             for (int i = fullName.length - 1; i >= 0; i--) {
//             sb.append(fullName[i]);
//        }
//        System.out.println(sb);
        char fio =' ';

        for (int i = fullName.length-1; i >= 0; i= i - 1) {
            fio =fullName[i];
            System.out.print(fio);
        }
        System.out.println();
    }
    public static void main(String[] args) {

    //Задача 1
        int g = 2020;
        god(g);
    //Задачаа 2
        int clientDeviceYear = 2015;
        byte  telOs = 1; // 0 - IOS или 1 - Android
        int clientDivice = 2016;
        NewOS(clientDeviceYear, telOs, clientDivice);

    //Задача 3
        int deliveryDistance = 95;
        int time = 1;
        delivery(deliveryDistance,time);

    // Задача4
        String stroka = "abcddefgghiiijjk";
        dable(stroka);

    //Задача 5
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        reveseStroka(reverseFullName);

        // write your code here
    }
}
