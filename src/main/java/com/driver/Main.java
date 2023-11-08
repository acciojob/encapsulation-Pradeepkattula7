package com.driver;

public class Main {

    public static void main(String[] args) {

        RWOnly obj =new RWOnly();

        //obj.name="pradeep";

        //System.out.println(obj.name);

        obj.setName("pradeep");

        System.out.println(obj.getName());
    }
}