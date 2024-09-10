package dev.nerohaziel.seryu.entity;

public class Nurse extends Entity{
    public static int totalNurses = 0;

    public Nurse(String name) {
        super(name);
        this.code = totalNurses;
        totalNurses++;

    }

    @Override
    public String getStatus() {
        return EmployeeStatus.getStatus(statusCode).getStatusName();

    }

}
