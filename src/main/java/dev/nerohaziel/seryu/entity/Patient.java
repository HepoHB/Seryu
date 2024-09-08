package dev.nerohaziel.seryu.entity;

import dev.nerohaziel.seryu.implementation.IRegister;

import java.util.ArrayList;
import java.util.List;

public class Patient implements IRegister{
    public static int totalPacients = 0;

    //Dados Básicos//
    private String name = "";
    private byte statusCode = 0;
    private byte age = 0;
    private String gender = "";
    private int pacientCode = 0;

    //Estilo de Vida//
    private boolean sexLife;
    private boolean smokes;
    private boolean alcoholConsumption;
    private boolean obesity;
    private boolean pregnant;

    //Listas de Dados//
    private List<String> symptons = new ArrayList<>();
    private List<String> surgeries = new ArrayList<>();
    private List<String> chronicDiseases = new ArrayList<>();

    //Outras Variáveis//
    private int responsibleMedicalCode;

    public Patient(String name, byte age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.pacientCode = totalPacients;
        totalPacients++;

    }

    public int getPacientCode(){
        return pacientCode;

    }

    @Override
    public String getStatus(){
        return PatientStatus.getStatus(statusCode).getStatusName();

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
