package dev.nerohaziel.seryu.core;

import dev.nerohaziel.seryu.entity.Medical;
import dev.nerohaziel.seryu.entity.Patient;

public class Main{
    public static void main(String[] args){
        Medical paty = new Medical("Baizhu");
        System.out.println(paty.getStatus());
        Patient lisa = new Patient("Lisa", (byte) 27,"Mulher");
        lisa.getRecord();
        Patient fischil = new Patient("Fischl",(byte) 18,"Mulher");
        fischil.getRecord();

    }

}