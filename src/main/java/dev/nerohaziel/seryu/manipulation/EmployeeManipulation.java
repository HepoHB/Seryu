package dev.nerohaziel.seryu.manipulation;

import dev.nerohaziel.seryu.entity.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class EmployeeManipulation{
    public static ArrayList<Medical> medicals = new ArrayList<>();
    public static ArrayList<Secretary> secretaries = new ArrayList<>();
    public static ArrayList<Nurse> nurses = new ArrayList<>();

    public static void addMedical(String name, String mail, String password){
        medicals.add(new Medical(name, mail, password));

    }
    public static void addNurse(String name, String mail, String password){
        nurses.add(new Nurse (name, mail, password));

    }
    public static void addSecretary(String name, String mail, String password){
        secretaries.add(new Secretary(name, mail, password));

    }



    public static <T extends Entity> ArrayList<Entity> filterArray(byte code, T[] values){
        ArrayList<Entity> filteredArrayList =  Arrays.stream(values).filter(employee -> employee.getStatusCode() == code).collect(Collectors.toCollection(ArrayList::new));

        return filteredArrayList;

    }


}
