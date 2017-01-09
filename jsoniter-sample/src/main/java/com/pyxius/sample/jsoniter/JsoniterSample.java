package com.pyxius.sample.jsoniter;

import com.jsoniter.output.JsonStream;

public class JsoniterSample {

    public static void main(String[] args) {
        System.out.println(JsonStream.serialize(new int[]{1,2,3})); // object => JSON



        System.out.println("Hello World!!!");
    }
}
