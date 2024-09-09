package dev.nerohaziel.seryu.manipulation;

import dev.nerohaziel.seryu.entity.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class EmployeeManipulation{
    public static ArrayList<Medical> medicals = new ArrayList<>();
    public static ArrayList<Secretary> secretaries = new ArrayList<>();
    public static ArrayList<Nurse> nurses = new ArrayList<>();

    public static void addMedical(String name){
        medicals.add(new Medical(name));

    }
    public static void addNurse(String name){
        nurses.add(new Nurse (name));

    }
    public static void addSecretary(String name){
        secretaries.add(new Secretary(name));

    }



    public static <T extends Entity> ArrayList<Entity> filterArray(byte code, T[] values){
        ArrayList<Entity> filteredArrayList =  Arrays.stream(values).filter(employee -> employee.getStatusCode() == code).collect(Collectors.toCollection(ArrayList::new));

        return filteredArrayList;

    }


}
