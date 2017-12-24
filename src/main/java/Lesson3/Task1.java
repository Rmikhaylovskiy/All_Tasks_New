package Lesson3;

import java.util.Scanner;

public class Task1 {
    double a;
    double b;
    double c;
    public static void modern_calcul()throws ArithmeticException{

        Task1 object_1 = new Task1();
        Task1 object_2 = new Task1();
        Task1 object_3 = new Task1();

        Scanner input = new Scanner(System.in);
        System.out.println("Введите а");
        object_1.a=input.nextDouble();
        Scanner input_2 = new Scanner(System.in);
        System.out.println("Введите b");
        object_2.b=input.nextDouble();
        object_3.c=0;
        String choose = new String();
        System.out.println("Введите действие");
        choose=input_2.nextLine();
        switch (choose){

            case "+": object_3.c=object_1.a+object_2.b;
                System.out.println(object_3.c);
                break;
            case  "-": object_3.c=object_1.a-object_2.b;
                System.out.println(object_3.c);
                break;
            case "*": object_3.c= object_1.a*object_2.b;
                System.out.println(object_3.c);
                break;
            case "/":
                object_3.c=object_1.a/object_2.b;
                System.out.println(object_3.c);



                break;
            default: System.out.println("Не правильное  действие");
        }
    }
}
