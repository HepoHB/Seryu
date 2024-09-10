package dev.nerohaziel.seryu.entity;

public class Medical extends Entity{
    public static int totalMedicals = 0;

    //Dados Básicos//
     private String mail = "";
    private String password = "";

    public Medical(String name, String mail, String password){
        super(name);
        this.code = totalMedicals;
        totalMedicals++;

    }

    @Override
    public String getStatus(){
        return EmployeeStatus.getStatus(statusCode).getStatusName();


    }

    public String getPassword() {
        return password;

    }

    public String getMail() {
        return mail;

    }

}
