package dev.nerohaziel.seryu.entity;

import dev.nerohaziel.seryu.implementation.IRegister;

public class Medical extends Entity{
    public static int totalPacients = 0;

    //Dados Básicos//
    String name = "";
    byte statusCode = 0;

    public Medical(String name){
        super(name);
    }

    @Override
    public String getStatus(){
        return MedicalStatus.getStatus(statusCode).getStatusName();


    }

}
