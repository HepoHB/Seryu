package dev.nerohaziel.seryu.implementation;

public interface IRegister{
    String name = "";
    int status = 0;

    int getStatus();

    void updateStatus();

    String getName();


}
