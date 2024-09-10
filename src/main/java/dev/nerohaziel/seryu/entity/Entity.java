package dev.nerohaziel.seryu.entity;

import dev.nerohaziel.seryu.implementation.IRegister;

public abstract class Entity implements IRegister{
    String name = "";
    protected byte statusCode = 0;
    protected int code = 0;

    public Entity(String name){
        this.name = name;

    }

    public int getCode(){
        return code;

    }


    public byte getStatusCode(){
        return statusCode;

    }

    @Override
    public String getName(){
        return name;

    }

    public void updateStatus(byte statusCode){
        this.statusCode = statusCode;

    }

    public abstract String getStatus();

}
