package Lesson2;

import java.util.ArrayList;

public class Task5 {
   double price;
    int weight;
    String name;
    int parametr;

    public static void gift(){

        Task5 candy = new Task5();
        Task5 jellybean = new Task5();
        Task5 ice_cream = new Task5();
        Task5 kitkat = new Task5();
        Task5 nougat = new Task5();
        Task5 Prezent = new Task5();

        candy.name="Candy";
        candy.parametr=1;
        candy.price=25.6;
        candy.weight=256;

        jellybean.name="Jellybean";
        jellybean.parametr=2;
        jellybean.price=45.50;
        jellybean.weight=300;

        ice_cream.name="Ice_cream";
        ice_cream.parametr=3;
        ice_cream.price=100;
        ice_cream.weight=50;

        kitkat.name="Kitkat";
        kitkat.parametr=4;
        kitkat.price=80;
        kitkat.weight=350;


        nougat.name="Nougat";
        nougat.parametr=5;
        nougat.price=120;
        nougat.weight=400;


        ArrayList prezent = new ArrayList();
        prezent.add(candy.name);
        prezent.add(candy.price);
        prezent.add(candy.weight);
        prezent.add(candy.parametr);

        prezent.add(jellybean.name);
        prezent.add(jellybean.price);
        prezent.add(jellybean.weight);
        prezent.add(jellybean.parametr);

        prezent.add(ice_cream.name);
        prezent.add(ice_cream.price);
        prezent.add(ice_cream.weight);
        prezent.add(ice_cream.parametr);

        prezent.add(kitkat.name);
        prezent.add(kitkat.price);
        prezent.add(kitkat.weight);
        prezent.add(kitkat.parametr);

        prezent.add(nougat.name);
        prezent.add(nougat.price);
        prezent.add(nougat.weight);
        prezent.add(nougat.parametr);



        Prezent.weight=candy.weight+jellybean.weight+ice_cream.weight+kitkat.weight+nougat.weight;
        Prezent.price=candy.price+jellybean.price+ice_cream.price+kitkat.price+nougat.price;
        System.out.println("Вес всего подарка равен " + Prezent.weight);
        System.out.println("Цена всего подарка равна " + Prezent.price );
        System.out.println("В подарок входят " + prezent);
    }
}
