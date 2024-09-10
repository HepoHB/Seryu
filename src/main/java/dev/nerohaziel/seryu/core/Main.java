package dev.nerohaziel.seryu.core;

import dev.nerohaziel.seryu.entity.Medical;
import dev.nerohaziel.seryu.entity.Nurse;
import dev.nerohaziel.seryu.entity.Patient;
import dev.nerohaziel.seryu.entity.Secretary;
import dev.nerohaziel.seryu.manipulation.EmployeeManipulation;
import dev.nerohaziel.seryu.manipulation.PatientManipulation;
import dev.nerohaziel.seryu.view.PatientLog;
import dev.nerohaziel.seryu.view.RecordView;

public class Main{
    public static void main(String[] args){

        ExampleDatabase.importExamples();

        for(Patient p : PatientManipulation.patients){
            RecordView.getRecord(p);

        }
        for(Medical m : EmployeeManipulation.medicals){
            RecordView.getRecord(m);

        }
        for(Nurse n : EmployeeManipulation.nurses){
            RecordView.getRecord(n);

        }
        for(Secretary s : EmployeeManipulation.secretaries){
            RecordView.getRecord(s);

        }
        PatientLog.generateLog(PatientManipulation.patients.get(4));

    }

}