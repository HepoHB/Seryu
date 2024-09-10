package dev.nerohaziel.seryu.view;

import dev.nerohaziel.seryu.entity.Medical;
import dev.nerohaziel.seryu.entity.Nurse;
import dev.nerohaziel.seryu.entity.Patient;
import dev.nerohaziel.seryu.entity.Secretary;

public class RecordView{
    public static void getRecord(Patient patient){
        System.out.println("--------Ficha do/a/e Paciente--------");
        System.out.println("-------------------------------------");
        System.out.println("------------Dados Básicos------------");
        System.out.println("Nome: " + patient.getName());
        System.out.println("Idade: " + patient.getAge());
        System.out.println("Gênero: " + patient.getGender());
        System.out.println("Código de Identificação: " + patient.getCode());
        System.out.println("-------------------------------------");
        System.out.println("Situação: " + patient.getStatus());
        System.out.println("-----------Estilos de Vida-----------");
        System.out.println("Vida Sexual Ativa: " + (patient.isSexLife() ? "Sim" : "Não"));
        System.out.println("Consumo de Tabaco: " + (patient.isSmokes() ? "Sim" : "Não"));
        System.out.println("Consumo de Álcool: " + (patient.isAlcoholConsumption() ? "Sim" : "Não"));
        System.out.println("Obesidade: " + (patient.isObesity() ? "Sim" : "Não"));
        System.out.println("Gravidez: " + (patient.isPregnant() ? "Sim" : "Não"));
        System.out.println("-----------Doenças Crônicas----------");
        for(String c : patient.getchronicDiseases()){
            System.out.println(c + " ");

        }
        System.out.println("--------------Cirurgias--------------");
        for(String s : patient.getSurgeries()){
            System.out.println(s + " ");

        }
        System.out.println("-----Medicamentos de Uso Contínuo----");
        for(String meds : patient.getContinuousMeds()){
            System.out.println(meds + " ");

        }
        System.out.println("-------------------------------------");
        System.out.println("x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x");
        System.out.println(" ");


    }


    public static void getRecord(Medical medical){
        System.out.println("-------Ficha do/a/e Médico/a/e-------");
        System.out.println("-------------------------------------");
        System.out.println("------------Dados Básicos------------");
        System.out.println("Nome: " + medical.getName());
        System.out.println("Código de Identificação: " + medical.getCode());
        System.out.println("-------------------------------------");
        System.out.println("Situação: " + medical.getStatus());
        System.out.println("-------------------------------------");
        System.out.println("x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x");
        System.out.println(" ");


    }

    public static void getRecord(Nurse nurse){
        System.out.println("-----Ficha do/a/e Enfermeiro/a/e-----");
        System.out.println("-------------------------------------");
        System.out.println("------------Dados Básicos------------");
        System.out.println("Nome: " + nurse.getName());
        System.out.println("Código de Identificação: " + nurse.getCode());
        System.out.println("-------------------------------------");
        System.out.println("Situação: " + nurse.getStatus());
        System.out.println("-------------------------------------");
        System.out.println("x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x");
        System.out.println(" ");

    }

    public static void getRecord(Secretary secretary){
        System.out.println("-----Ficha do/a/e Secretário/a/e-----");
        System.out.println("-------------------------------------");
        System.out.println("------------Dados Básicos------------");
        System.out.println("Nome: " + secretary.getName());
        System.out.println("Código de Identificação: " + secretary.getCode());
        System.out.println("-------------------------------------");
        System.out.println("Situação: " + secretary.getStatus());
        System.out.println("-------------------------------------");
        System.out.println("x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x");
        System.out.println(" ");

    }

}
