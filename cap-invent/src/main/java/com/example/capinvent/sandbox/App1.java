package com.example.capinvent.sandbox;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class App1 {


    private String reverseString(String hello) {
        StringBuilder sb = new StringBuilder();
        char[] chars = hello.toCharArray();
        for (int i = chars.length -1; i >= 0; i--) {
            sb.append(chars[i]);

        }
        return sb.toString();
    }

    @Test
    public void testReverseString() {
        App1 app1 = new App1();
        String hello = app1.reverseString("Hello");

        assertEquals("olleH", hello);
    }


}
