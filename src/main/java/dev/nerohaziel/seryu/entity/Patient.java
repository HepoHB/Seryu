package dev.nerohaziel.seryu.entity;

import dev.nerohaziel.seryu.core.Status;
import dev.nerohaziel.seryu.implementation.IRegister;

import java.util.ArrayList;
import java.util.List;

public class Patient implements IRegister{
    private String name = "";
    private byte statusCode = 0;
    private byte age = 0;
    private String gender = "";

    private boolean sexLife;
    private boolean smokes;
    private boolean alcoholConsumption;

    private List<String> symptons = new ArrayList<>();
    private List<String> surgeries = new ArrayList<>();
    private List<String> chronicDiseases = new ArrayList<>();

    public Patient(String name, byte age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    @Override
    public String getStatus(){
        return Status.getStatus(statusCode).getStatusName();

    }

    @Override
    public void updateStatus(byte statusCode){
        this.statusCode = statusCode;

    }

    @Override
    public String getName(){
        return name;

    }

}
