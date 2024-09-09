package dev.nerohaziel.seryu.core;

import dev.nerohaziel.seryu.entity.Medical;
import dev.nerohaziel.seryu.entity.Nurse;
import dev.nerohaziel.seryu.entity.Patient;
import dev.nerohaziel.seryu.entity.Secretary;
import dev.nerohaziel.seryu.manipulation.EmployeeManipulation;
import dev.nerohaziel.seryu.manipulation.PatientManipulation;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args){

        ExampleDatabase.importExamples();

        for(Patient p : PatientManipulation.patients){
            p.getRecord();

        }
        for(Medical m : EmployeeManipulation.medicals){
            m.getRecord();

        }
        for(Nurse n : EmployeeManipulation.nurses){
            n.getRecord();

        }
        for(Secretary s : EmployeeManipulation.secretaries){
            s.getRecord();

        }

    }

}