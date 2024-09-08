package dev.nerohaziel.seryu.core;

import dev.nerohaziel.seryu.entity.Patient;

public class Main{
    public static void main(String[] args){
        Patient paty = new Patient("Baizhu", (byte) 22,"Cisgender Male");
        System.out.println(paty.getName());
        System.out.println(paty.getStatus());

    }

}