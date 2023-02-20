package com.example.capinvent.beans;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class App3 {


    public static void main(String[] args) {

        List<String> list = Arrays.asList("Z", "C", "B", "A");

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        // Collections.sort(list);

        /*Collections.sort(list, (o1, o2) -> {
            return o2.equalsIgnoreCase(o1);

        });*/

        System.out.println(list);







    }

}
