package dev.nerohaziel.seryu.core;

import dev.nerohaziel.seryu.entity.Medical;
import dev.nerohaziel.seryu.entity.Nurse;
import dev.nerohaziel.seryu.entity.Patient;
import dev.nerohaziel.seryu.entity.Secretary;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main{
    public static void main(String[] args){
       /* Medical medical = new Medical("Baizhu");
        medical.getRecord();
        Nurse nurse = new Nurse("Lisa");
        nurse.getRecord();
        Secretary secretary = new Secretary("Qiqi");
        secretary.getRecord();
*/
        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Lumine",(byte) 18, "Mulher"));
        patients.add(new Patient("Fischl",(byte) 18, "Mulher"));
        patients.add(new Patient("Venti",(byte) 18, "Possivelmente Homem"));
        patients.add(new Patient("Bennett",(byte) 17, "Homem"));
        patients.get(1).getRecord();
        for(Patient p : patients){
            p.getRecord();

        }
        System.out.println("AQUI VAI BOMBA");
        patients.get(3).updateStatus((byte) 7);

        ArrayList<Patient> ICUPatients =  patients.stream().filter(patient -> patient.getStatusCode() == (byte) 7).collect(Collectors.toCollection(ArrayList::new));
        for(Patient p : ICUPatients){
            p.getRecord();

        }

    }

}