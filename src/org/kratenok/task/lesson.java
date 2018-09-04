package org.kratenok.task;

import java.util.Scanner;

public class lesson {
    public static void main(String[] args)     {
       Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число лет");
            int result = scanner.nextInt();
            int temp = result % 10;
            if ((temp > 4 && temp <= 9) || (temp == 0)) {
                System.out.println("Ваш возраст" + result + "лет");
            } else {
                if (result % 100 >=11 && result % 100 <= 14) {
                    System.out.println("Ваш возраст" + result + "лет");
                } else {
                    if (temp == 1) {
                        System.out.println("Ваш возраст" + result + "год");
                    } else {
                        System.out.println("Ваш возраст" + result + "года");
                    }
                }
            }
        }
    }

}


