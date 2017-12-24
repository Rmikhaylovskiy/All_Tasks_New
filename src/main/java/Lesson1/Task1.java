package Lesson1;

import java.util.Scanner;
import java.util.Scanner;

import static Lesson2.Task2.*;
import static Lesson2.Task2.massiv_strok;
import static Lesson2.Task3.choose_calcul_or_massiv_strok;
import static Lesson2.Task4.random_massiv;
import static Lesson2.Task5.gift;
import static Lesson3.Task1.modern_calcul;
import static Lesson4.Task2.new_calcul;
import static Lesson4.Task1.file;


public class Task1 {
    public static void calcul(){


        Scanner input = new Scanner(System.in);
        System.out.println("Введите а");
        double a=input.nextDouble();
        Scanner input_2 = new Scanner(System.in);
        System.out.println("Введите b");
        double b=input.nextDouble();
        double c=0;
        String choose = new String();
        System.out.println("Введите действие");
        choose=input_2.nextLine();
        switch (choose){

            case "+": c=a+b;
                System.out.println(c);
                break;
            case  "-": c=a-b;
                System.out.println(c);
                break;
            case "*": c=a*b;
                System.out.println(c);
                break;
            case "/": c=a/b;
                System.out.println(c);
                break;
            default: System.out.println("Не правильное  действие");
        }
    }


    public static void main(String[] args){
        System.out.println("Введите номер задания от 1 до 8");
        Scanner input = new Scanner(System.in);
        String choose = input.nextLine();
        switch (choose){

            case "1":calcul();
                break;
            case "2":massiv_strok();
                break;
            case "3":choose_calcul_or_massiv_strok();
                break;
            case "4":random_massiv();
                break;
            case "5":gift();
                break;
            case "6":modern_calcul();
                break;
            case "7":new_calcul();
                break;

            case "8":file();
                break;
            default:System.out.println("Вы ввели несуществующий номер задания");



        }









    }

}
