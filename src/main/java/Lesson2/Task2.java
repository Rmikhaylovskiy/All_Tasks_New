package Lesson2;

import java.util.Scanner;

public class Task2 {
    int max;

    public static void massiv_strok (){
        Task2 object = new Task2();
        System.out.println("Введите количество строк(размер массива строк)");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        String mass[]= new String[size];

        System.out.println("Введите Строки");


        for (int i=0;i<size;i++) {
            mass[i] = input.next();
            System.out.println("строки[" + i + "] = " + mass[i]);


        }
        object.max = 0;
        for (int i=1; i<mass.length;i++){
            if(mass[i].length() > mass[object.max].length())
                object.max = i;

        }

        System.out.println("Наибольшая строка " + mass[object.max]);





    }
}
