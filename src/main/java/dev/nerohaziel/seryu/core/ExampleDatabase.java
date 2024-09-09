package dev.nerohaziel.seryu.core;

import dev.nerohaziel.seryu.entity.Medical;
import dev.nerohaziel.seryu.entity.Nurse;
import dev.nerohaziel.seryu.entity.Secretary;
import dev.nerohaziel.seryu.manipulation.EmployeeManipulation;
import dev.nerohaziel.seryu.manipulation.PatientManipulation;

public class ExampleDatabase{
    // Esta classe existe puramente para definir uma base de dados de teste.
    // Caso o programa estivesse em real funcionamento, esta classe não existiria pois os dados seriam adicionados conforme necessidade.

    public static void importExamples(){
        PatientManipulation.addPatient("Lumine",(byte) 16, "Feminino");
        PatientManipulation.addPatient("Fischl",(byte) 18, "Feminino");
        PatientManipulation.patients.get(1).updateStatus((byte) 5);
        PatientManipulation.addPatient("Liney",(byte) 16, "Possivelmente Masculino");
        PatientManipulation.patients.get(2).updateStatus((byte) 9);
        PatientManipulation.addPatient("Bennett",(byte) 17, "Homem");
        PatientManipulation.patients.get(3).updateStatus((byte) 7);
        PatientManipulation.addPatient("Jean",(byte) 20, "Mulher");
        PatientManipulation.patients.get(4).updateStatus((byte) 3);
        PatientManipulation.addPatient("Diluc",(byte) 23, "Masculino");
        PatientManipulation.patients.get(5).updateStatus((byte) 8);
        PatientManipulation.addPatient("Lynette ",(byte) 23, "Mulher");
        PatientManipulation.patients.get(6).updateStatus((byte) 12);

        EmployeeManipulation.addMedical("Baizhu");
        EmployeeManipulation.medicals.get(0).updateStatus((byte) 3);
        EmployeeManipulation.addMedical("Albedo");
        EmployeeManipulation.addNurse("Lisa");
        EmployeeManipulation.nurses.get(0).updateStatus((byte) 1);
        EmployeeManipulation.addNurse("Sigewinne");
        EmployeeManipulation.addSecretary("Qiqi");
        EmployeeManipulation.secretaries.get(0).updateStatus((byte) 5);
        EmployeeManipulation.addSecretary("Katheryne");

    }

}
