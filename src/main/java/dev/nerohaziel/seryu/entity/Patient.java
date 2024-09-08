package dev.nerohaziel.seryu.entity;

import dev.nerohaziel.seryu.implementation.IRegister;

import java.util.ArrayList;
import java.util.List;

public class Patient implements IRegister{
    private String name = "";
    private int status = 0;
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
    public int getStatus(){
        return this.status;
    }

    @Override
    public void updateStatus(){

    }

    @Override
    public String getName(){
        return this.name;

    }

}
