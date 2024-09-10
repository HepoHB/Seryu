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
    public String getStatus(){
        return EmployeeStatus.getStatus(statusCode).getStatusName();


    }

}
