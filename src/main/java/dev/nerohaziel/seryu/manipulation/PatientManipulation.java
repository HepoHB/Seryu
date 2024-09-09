package dev.nerohaziel.seryu.manipulation;

import dev.nerohaziel.seryu.entity.Patient;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class PatientManipulation{

    public static ArrayList<Patient> patients = new ArrayList<>();

    public static void addPatient(String name, byte age, String gender){
        patients.add(new Patient(name, age, gender));

    }



    public static ArrayList<Patient> filterArray(byte code){
        ArrayList<Patient> filteredArrayList =  patients.stream().filter(patient -> patient.getStatusCode() == code).collect(Collectors.toCollection(ArrayList::new));

        return filteredArrayList;

    }

}
