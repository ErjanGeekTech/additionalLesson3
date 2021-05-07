package com.company;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int sum = scanner.nextInt();
        int[] array = {1,3,4,6,8,9,12,14,16,18,22,25,27,28,32,35,37,39,43,48,53};
        boolean ResultOk = false;
        int first = 0;
        int pos = 0;
        int last = array.length;
        while (first < last){
            int middle = (first + last) / 2;
            if (sum == array[middle]){
                first = middle;
                last = first;
                ResultOk= true;
                 pos = middle;
            }else {
                if (sum > array[middle]){
                    first = middle + 1;
                }else {
                    last = middle-1;
                }
            }
        }
        if (ResultOk == true){
            System.out.println("Элемент найден "+ pos);
        }else {
            System.out.println("Елемент не найден");
        }
    }
}
