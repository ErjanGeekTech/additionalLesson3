package com.company;

import java.util.Scanner;

public class Sequential {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int sum = scanner.nextInt();
        int[] array = {1, 4, 6, 8, 9, 15, 17, 20, 23, 27};
        boolean ResultOk = false;
        int pos = -1;
        int j = 0;
        while (j < array.length && pos == -1){
            if (array[j] == sum){
                pos = j;
                ResultOk = true;
            }else {
                j++;
            }
        }
        if (ResultOk == true){
            System.out.println("Элемент найден "+ pos);
        }else {
            System.out.println("Елемент не найден");
        }
    }
}
