package Lesson4;


import java.util.Scanner;

public class Task2 {
    int a;
    int b;
    int c;
    public static void new_calcul()throws ArithmeticException{

        Task2 object_1 = new Task2();
        Task2 object_2 = new Task2();
        Task2 object_3 = new Task2();

        Scanner input = new Scanner(System.in);
        System.out.println("Введите а");
        object_1.a=input.nextInt();
        Scanner input_2 = new Scanner(System.in);
        System.out.println("Введите b");
        object_2.b=input.nextInt();
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
            case "/": try {
                object_3.c=object_1.a/object_2.b;
                System.out.println(object_3.c);
            }
            catch (ArithmeticException e){
                System.out.println("На 0 делить нельзя");
            }

                break;
            default: System.out.println("Не правильное  действие");
        }
    }


}
