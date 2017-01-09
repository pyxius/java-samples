package com.pyxius.sample.java8;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SimpleDateFormatSample {
    public static void main(String[] args) {
        try {
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            df.setLenient(false);
            System.out.println(df.parse("10/26/2016"));

        }catch(ParseException pe){
            pe.printStackTrace();
        }

        System.out.println();
    }
}
