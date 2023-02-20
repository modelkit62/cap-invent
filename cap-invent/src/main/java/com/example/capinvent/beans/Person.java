package com.example.capinvent.beans;


import lombok.Data;
import lombok.NonNull;
import org.springframework.validation.annotation.Validated;

import java.util.regex.Pattern;

@Data
public class Person {

    private static final Pattern ALLOWED = Pattern.compile("Sinatra");


    @NonNull
    private String name;

    public Person(String name) {
        if (!ALLOWED.matcher(name).matches()) {
            throw new IllegalArgumentException("Bad name");
        }
        this.name = name;
    }


}
