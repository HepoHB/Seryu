package dev.nerohaziel.seryu.entity;

public class Medical extends Entity{
    public static int totalMedicals = 0;

    //Dados Básicos//
    String name = "";

    public Medical(String name){
        super(name);
        this.code = totalMedicals;
        totalMedicals++;

    }

    @Override
    public void getRecord() {
        System.out.println("-------Ficha do/a/e Médico/a/e-------");
        System.out.println("-------------------------------------");
        System.out.println("Nome: " + getName());
        System.out.println("Código de Identificação: " + getCode());
        System.out.println("-------------------------------------");
        System.out.println("Situação: " + getStatus());
        System.out.println("-------------------------------------");
        System.out.println("x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x");
        System.out.println(" ");

    }

    @Override
    public String getStatus(){
        return EmployeeStatus.getStatus(statusCode).getStatusName();


    }

}
