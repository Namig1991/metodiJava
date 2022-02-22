package ru.skypro;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int year = 2022;
        printIsLeapYear(year);
        System.out.println();

        int deviseOs = 0;
        int yourDeviseYear = 2012;
        printResultSetupOs(deviseOs, yourDeviseYear);
        System.out.println();


        System.out.println("Колличествой дней для доставки " + printResultDeliveryDistance(50));
        System.out.println();

        printDuplecates("aabccddefgghiijjkk");
        System.out.println();

        int [] arr = new int[] {3, 2, 1, 6, 5};
        reverseArray(arr);
        System.out.println("Reversed Array " + Arrays.toString(arr));
        System.out.println();
    }
    //Задание №1
    public static void printIsLeapYear (int year) {
        boolean yearIsLeap = isLeap(year);
        printIsLeapYearResult (year, yearIsLeap);
    }
    private static boolean isLeap (int year){
        return year % 4 == 0 && year % 100 !=0 && year % 400 == 0;
    }
    public static void printIsLeapYearResult (int year, boolean yearIsLeap){
        if (yearIsLeap){
            System.out.print(year + " Год високосный");
        }else{
            System.out.print(year + " Год не високосный");
        }
    }
    //Задание №2
    public static void printResultSetupOs (int devise, int yourDeviseYear) {
        if (devise == 1) {
            System.out.print("Установите версию для Android");
        }else if (devise ==0) {
            System.out.print("Установите версию для IOs");
        }
        if (yourDeviseYear <= 2015 && devise == 1) {
            System.out.print(" Лайт");
        }else if (yourDeviseYear <= 2015 && devise ==0) {
            System.out.print(" Лайт");
        }
    }
    //Задание №3
    public static int printResultDeliveryDistance (int deliveryDistance){
        int daysNumber = 0;
        if (deliveryDistance <= 20){
            daysNumber = daysNumber + 1;
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60){
            daysNumber = daysNumber + 2;
        }
        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            daysNumber = daysNumber + 3;
        }
        return daysNumber;
    }
    //Задание №4
    public static void printDuplecates (String text) {
        char [] letters = text.toCharArray();
        boolean isDuplicateExist = false;
        for (int i = 1; i < letters.length; i++) {
            if ( letters[i] == letters[i - 1]) {
                System.out.println("Найден дубликат по символу " + letters [i]);
                isDuplicateExist = true;
                break;
            }
        } if (!isDuplicateExist) {
            System.out.println("Дубликатов не найдено");
        }
    }
    //Задание №5
    public static void reverseArray (int[] arr){
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        while (leftIndex < rightIndex) {
            int temp = arr[leftIndex];
            arr[leftIndex] = arr[rightIndex];
            arr[rightIndex] = temp;
            leftIndex++;
            rightIndex--;
        }

    }

}
