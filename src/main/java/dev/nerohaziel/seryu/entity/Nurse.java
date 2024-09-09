package dev.nerohaziel.seryu.entity;

public class Nurse extends Entity{
    public Nurse(String name) {
        super(name);

    }

    @Override
    public void getRecord(){
        System.out.println("-----Ficha do/a/e Enfermeiro/a/e-----");
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
    public String getStatus() {
        return EmployeeStatus.getStatus(statusCode).getStatusName();

    }

}
