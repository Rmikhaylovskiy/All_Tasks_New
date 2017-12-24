package Lesson2;

public class Task4 {
    public static void random_massiv(){

        int[] mass = new int[20];
        int min_pol=10;
        int max_otr=-10;
        int pol = 0;
        int otr = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = ((int)(Math.random() * 21) - 10);
            System.out.println("mass[" + i + "] = " + mass[i]);
            if(mass[i]>0  && min_pol>mass[i]) {
                min_pol=mass[i];
                pol = i;

            }


            if (mass[i]<0 && max_otr<mass[i] ){
                max_otr=mass[i];
                otr = i;
            }

        }

        System.out.println("Минимальный положительный элемент массива равен " + min_pol);
        System.out.println("Максимальный отрицательный элемент массива равен " + max_otr);

        mass[pol] = max_otr;
        mass[otr] = min_pol;

        for (int i = 0; i < mass.length; i++) {
            System.out.println("mass[" + i + "] = " + mass[i]);}


    }
}
