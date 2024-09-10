package dev.nerohaziel.seryu.view;

import dev.nerohaziel.seryu.entity.Patient;
import dev.nerohaziel.seryu.entity.Secretary;
import dev.nerohaziel.seryu.manipulation.EmployeeManipulation;

import java.util.ArrayList;

public class PatientLog{
    public static void generateLog(Patient patient){
            System.out.println("--------Log do/a/e Paciente--------");
            System.out.println("-------------------------------------");
            System.out.println("------------Dados Básicos------------");
            System.out.println("Nome: " + patient.getName());
            System.out.println("Código de Identificação: " + patient.getCode());
            System.out.println("-------------------------------------");
            System.out.println("Situação: " + patient.getStatus());
            System.out.println("---------------Sintomas--------------");
            for(String s : patient.getSymptons()){
            System.out.println(s + " ");

            }
            System.out.println("----------Registro Hospitalar--------");

            byte workFunction = 0;
            byte forControlVar = 0;
            for(Object s : patient.getPatientInfo()){
                if(forControlVar == 2){
                    workFunction = (byte) s;
                    forControlVar++;

                } else if(forControlVar >= 3){
                    switch(workFunction){
                        case (byte) 0:
                            System.out.println("Assinado por: " + EmployeeManipulation.secretaries.get((int) s).getName());
                            System.out.println("-------------------------------------");
                            forControlVar = 0;
                            break;
                        case (byte) 1:
                            System.out.println("Assinado por: " + EmployeeManipulation.nurses.get((int) s).getName());
                            System.out.println("-------------------------------------");
                            forControlVar = 0;
                            break;
                        case (byte) 2:
                            System.out.println("Assinado por: " + EmployeeManipulation.medicals.get((int) s).getName());
                            System.out.println("-------------------------------------");
                            forControlVar = 0;
                            break;
                        default:
                            throw new RuntimeException("Pessoa Desconhecida");

                    }

                } else{
                    System.out.println(s.toString() + " ");
                    forControlVar++;

                }

            }

    }

}
