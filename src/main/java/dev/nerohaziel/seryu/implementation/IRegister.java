package dev.nerohaziel.seryu.implementation;

public interface IRegister{
    String name = "";
    int statusCode = 0;

    String getStatus();

    void updateStatus(byte code);

    String getName();


}
