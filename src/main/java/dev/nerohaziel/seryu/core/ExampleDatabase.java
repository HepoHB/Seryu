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
        PatientManipulation.addPatient("Lumine",(byte) 16, "Feminino"); // Sala de Espera

        PatientManipulation.addPatient("Fischl",(byte) 18, "Feminino");
        PatientManipulation.patients.get(1).updateStatus((byte) 5); // Sala de Exames
        PatientManipulation.patients.get(1).setAlcoholConsumption(true);
        PatientManipulation.patients.get(1).setSexLife(true);
        PatientManipulation.patients.get(1).setPregnant(true);
        PatientManipulation.patients.get(1).setContinuousMeds("Anticoncepcional: Valerato de Estradiol");

        PatientManipulation.addPatient("Liney",(byte) 16, "Possivelmente Masculino");
        PatientManipulation.patients.get(2).updateStatus((byte) 9); // Unidade de Internação
        PatientManipulation.addPatient("Bennett",(byte) 17, "Masculino");
        PatientManipulation.patients.get(3).updateStatus((byte) 7); // UTI

        PatientManipulation.addPatient("Jean",(byte) 20, "Feminino");
        PatientManipulation.patients.get(4).setAlcoholConsumption(true);
        PatientManipulation.patients.get(4).setSexLife(true);
        PatientManipulation.patients.get(4).setSmokes(true);
        PatientManipulation.patients.get(4).setChronicDiseases("Depressão");
        PatientManipulation.patients.get(4).setChronicDiseases("Workaholismo");
        PatientManipulation.patients.get(4).setSurgeries("Retirada de Apêndice");
        PatientManipulation.patients.get(4).setContinuousMeds("Antidepressivo: Diazepam");
        PatientManipulation.patients.get(4).setContinuousMeds("Antidepressivo: Exodus");
        PatientManipulation.patients.get(4).setContinuousMeds("Medicamento para Insônia: Flurazepam");
        PatientManipulation.patients.get(4).setSymptons("Tosse");
        PatientManipulation.patients.get(4).setSymptons("Febre Alta");
        PatientManipulation.patients.get(4).setSymptons("Cansaço Extremo");
        PatientManipulation.patients.get(4).setSymptons("Desmaios Ocasionais");
        PatientManipulation.patients.get(4).setPatientInfo("Após a triagem foi constatado que seus sintomas são provenientes do seu estilo de vida estressante e nada saudável.", (byte) 1, 1);
        PatientManipulation.patients.get(4).setPatientInfo("Após a consulta médica, a paciente foi encaminhada para a sala de infusão para repôr seus nutrientes perdidos e juntamente tomar um calmante", (byte) 2, 1);

        PatientManipulation.patients.get(4).updateStatus((byte) 3); // Sala de Infusão
        PatientManipulation.addPatient("Diluc",(byte) 23, "Masculino");
        PatientManipulation.patients.get(5).updateStatus((byte) 8); // Clínica de Especialidades
        PatientManipulation.addPatient("Lynette ",(byte) 23, "Feminino");
        PatientManipulation.patients.get(6).updateStatus((byte) 12); // Visitante
        PatientManipulation.addPatient("Nero Haziel", (byte) 21, "Feminino");
        PatientManipulation.patients.get(7).updateStatus((byte) 1);
        PatientManipulation.patients.get(7).setAlcoholConsumption(true);
        PatientManipulation.patients.get(7).setSexLife(true);
        PatientManipulation.patients.get(7).setChronicDiseases("Asma");


        EmployeeManipulation.addMedical("Baizhu","cobrasEEscadas@gmail.com","CobrinhaBacana");
        EmployeeManipulation.medicals.get(0).updateStatus((byte) 3);
        EmployeeManipulation.addMedical("Albedo","GeoVision@yahoo.com","LoveSucrose");
        EmployeeManipulation.addNurse("Lisa","LisaLisa@bol.com","AraAra");
        EmployeeManipulation.nurses.get(0).updateStatus((byte) 1);
        EmployeeManipulation.addNurse("Sigewinne","Sigewinne@meropide.com","WeslleySenpai!");
        EmployeeManipulation.addSecretary("Qiqi","TerrorOf5050@ig.com","ZombiesJustWannaDance");
        EmployeeManipulation.secretaries.get(0).updateStatus((byte) 5);
        EmployeeManipulation.addSecretary("Katheryne","Katheryne@adventuresguild.com","AdAstraAbyssosque");

    }

}
