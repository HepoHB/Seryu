package dev.nerohaziel.seryu.entity;

public class Secretary extends Entity{
    public static int totalSecretaries = 0;
    private String mail = "";
    private String password = "";

    public Secretary(String name, String mail, String password){
        super(name);
        this.mail = mail;
        this.password = password;
        this.code = totalSecretaries;
        totalSecretaries++;

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
