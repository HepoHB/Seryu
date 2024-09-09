package dev.nerohaziel.seryu.entity;

import dev.nerohaziel.seryu.implementation.IRegister;

import java.util.ArrayList;
import java.util.List;

public class Patient extends Entity{
    public static int totalPacients = 0;

    //Dados Básicos//
    private byte age = 0;
    private String gender = "";

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
        super(name);
        this.age = age;
        this.gender = gender;
        this.code = totalPacients;
        totalPacients++;

    }

    protected byte getAge(){
        return age;

    }

    protected String getGender(){
        return gender;

    }

    @Override
    public String getStatus(){
        return PatientStatus.getStatus(statusCode).getStatusName();

    }

    @Override
    public void getRecord(){
        System.out.println("--------Ficha do/a/e Paciente--------");
        System.out.println("-------------------------------------");
        System.out.println("Nome: " + getName());
        System.out.println("Idade: " + getAge());
        System.out.println("Gênero: " + getGender());
        System.out.println("Código de Identificação: " + getCode());
        System.out.println("-------------------------------------");
        System.out.println("Situação: " + getStatus());
        System.out.println("-------------------------------------");
        System.out.println("x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x");
        System.out.println(" ");



    }

}
