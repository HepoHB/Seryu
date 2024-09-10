package dev.nerohaziel.seryu.entity;

public class Nurse extends Entity{
    public static int totalNurses = 0;
    private String mail = "";
    private String password = "";

    public Nurse(String name, String mail, String password) {
        super(name);
        this.mail = mail;
        this.password = password;
        this.code = totalNurses;
        totalNurses++;

    }

    @Override
    public String getStatus() {
        return EmployeeStatus.getStatus(statusCode).getStatusName();

    }

    public String getPassword() {
        return password;

    }

    public String getMail() {
        return mail;

    }

}
