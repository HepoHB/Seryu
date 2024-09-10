package dev.nerohaziel.seryu.entity;

public class Secretary extends Entity{
    public static int totalSecretaries = 0;

    public Secretary(String name){
        super(name);
        this.code = totalSecretaries;
        totalSecretaries++;

    }

    @Override
    public String getStatus(){
        return EmployeeStatus.getStatus(statusCode).getStatusName();

    }

}
