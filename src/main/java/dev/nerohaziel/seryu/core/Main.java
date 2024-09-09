package dev.nerohaziel.seryu.core;

import dev.nerohaziel.seryu.entity.Patient;
import dev.nerohaziel.seryu.manipulation.PatientManipulation;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
       /* Medical medical = new Medical("Baizhu");
        medical.getRecord();
        Nurse nurse = new Nurse("Lisa");
        nurse.getRecord();
        Secretary secretary = new Secretary("Qiqi");
        secretary.getRecord();
*/

        PatientManipulation.addPatient("Lumine",(byte) 18, "Mulher");
        PatientManipulation.addPatient("Fischl",(byte) 18, "Mulher");
        PatientManipulation.addPatient("Venti",(byte) 18, "Possivelmente Homem");
        PatientManipulation.addPatient("Bennett",(byte) 17, "Homem");
        PatientManipulation.addPatient("Jean",(byte) 22, "Mulher");

        System.out.println("AQUI VAI BOMBA");
        PatientManipulation.patients.get(3).updateStatus((byte) 7);
        PatientManipulation.patients.get(1).updateStatus((byte) 7);

        ArrayList<Patient> ICUPatients = PatientManipulation.filterArray((byte) 7);
        /*for(Patient p : ICUPatients) {
            p.getRecord();

        }*/
        ArrayList<Patient> MedicalConsultation = PatientManipulation.filterArray((byte) 3);
        /*for(Patient p : MedicalConsultation) {
            p.getRecord();

        }*/

        for(Patient p : PatientManipulation.patients){
            p.getRecord();

        }

    }

}