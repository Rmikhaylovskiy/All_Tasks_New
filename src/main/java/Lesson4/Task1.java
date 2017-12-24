package Lesson4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task1 {
    public static void file(){
        Scanner input = null;
        try {
            input = new Scanner(new File("C:\\Task\\task.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        SortedMap< String, Integer > statistics = new TreeMap<>();
        Map.Entry< String, Integer > maxEntry = null;
        SortedSet<Map.Entry<String, Integer>> sortedset = new TreeSet<Map.Entry<String, Integer>>(
                new Comparator<Map.Entry<String, Integer>>() {
                    @Override
                    public int compare(Map.Entry<String, Integer> e1,
                                       Map.Entry<String, Integer> e2) {
                        return e1.getValue().compareTo(e2.getValue());
                    }
                });

        while (input.hasNext()) {
            String words = input.useDelimiter("\\s+").next();
            Integer count = statistics.get(words);
            if (count == null) {
                count = 0;
            }
            for (Map.Entry< String, Integer > entry : statistics.entrySet())
            {

                if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
                {
                    maxEntry = entry;
                }
            }

            statistics.put(words, ++count);
            sortedset.addAll(statistics.entrySet());

        }
        System.out.println(statistics);
        System.out.println("Самое максимально повторяющееся слово " + maxEntry);




    }



}
