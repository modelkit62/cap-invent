package com.example.capinvent.beans;

import java.util.Arrays;
import java.util.List;

public class App2 {

    public void reverseString(String text) {
        /*String[] s = text.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = s.length - 1; i >= 0 ; i--){
            stringBuilder.append(s[i]);
        }
        System.out.println(stringBuilder);*/

        String s = new StringBuilder(text).reverse().toString();
        System.out.println(s);

    }


    public void isCapicua(int numero){
        String s1 = String.valueOf(numero);
        String s2 = new StringBuilder(s1).reverse().toString();
        if (s1.equals(s2)){
            System.out.println("are capicua");
        } else {
            System.out.println("they are not!");
        }

    }

    public void cuantosMeRegalas(){

        List<String> list = Arrays.asList("uno");
        for(String s : list){
            if(list.size() % 3 != 0 ){
                System.out.println("no es multiplo de 3");
            }
        }
    }


    public static void main(String[] args) {
        App2 app = new App2();
        app.reverseString("Mitocode");
        app.isCapicua(353);
        app.cuantosMeRegalas();

    }


}
