package Lesson2;

import java.util.Scanner;

public class Task3 {
    int max;
    public static void choose_calcul_or_massiv_strok(){

        Task3 object = new Task3();
        System.out.println("Введите код действия: 1-калькулятор, 2-Поиск самой длинной строки");
        Scanner enter = new Scanner(System.in);
        int choose= enter.nextInt();


        switch (choose){

            case 1:Scanner input = new Scanner(System.in);
                System.out.println("Введите а");
                double a=input.nextDouble();
                Scanner input_2 = new Scanner(System.in);
                System.out.println("Введите b");
                double b=input.nextDouble();
                double c=0;
                String choose_1 = new String();
                System.out.println("Введите действие");
                choose_1=input_2.nextLine();
                if (choose_1.equals("+")) {
                    c = a + b;
                    System.out.println(c);

                } else if (choose_1.equals("-")) {
                    c = a - b;
                    System.out.println(c);

                } else if (choose_1.equals("*")) {
                    c = a * b;
                    System.out.println(c);

                } else if (choose_1.equals("/")) {
                    c = a / b;
                    System.out.println(c);

                } else {
                    System.out.println("Не правильное  действие");
                }
                break;

            case 2: System.out.println("Введите количество строк(размер массива строк)");
                input = new Scanner(System.in);
                int size = input.nextInt();
                String mass[]= new String[size];

                System.out.println("Введите строки");


                for (int i=0;i<size;i++) {
                    mass[i] = input.next();
                    System.out.println("строка[" + i + "] = " + mass[i]);


                }



                object.max = 0;
                for (int i=1; i<mass.length;i++){
                    if(mass[i].length() > mass[object.max].length())
                        object.max = i;

                }

                System.out.println("Наибольшая строка " + mass[object.max]);

                break;

            default: System.out.println("Не правильно указали код действия");

        }



    }
}
