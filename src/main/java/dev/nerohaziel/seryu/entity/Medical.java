package dev.nerohaziel.seryu.entity;

import dev.nerohaziel.seryu.implementation.IRegister;

public class Medical implements IRegister{
    public static int totalPacients = 0;

    //Dados Básicos//
    String name = "";
    int statusCode = 0;

    @Override
    public String getStatus() {
        return "";
    }

    @Override
    public void updateStatus(byte code) {

    }

    @Override
    public String getName() {
        return "";
    }
}
