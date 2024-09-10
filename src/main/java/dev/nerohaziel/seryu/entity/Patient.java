package dev.nerohaziel.seryu.entity;

import dev.nerohaziel.seryu.implementation.IRegister;

import java.util.ArrayList;
import java.util.List;

public class Patient extends Entity{
    public static int totalPacients = 0;

    //Dados Básicos//
    private byte age = 0;
    private String gender = "";

    //Estilo de Vida//
    private boolean smokes;
    private boolean sexLife;
    private boolean alcoholConsumption;
    private boolean obesity;
    private boolean pregnant;

    //Listas de Dados//
    private List<String> symptons = new ArrayList<>();
    private List<String> surgeries = new ArrayList<>();
    private List<String> chronicDiseases = new ArrayList<>();
    private List<String> continuousMeds = new ArrayList<>();

    //Log//
    private List<String>  patientInfo = new ArrayList<>();

    //Outras Variáveis//
    private int responsibleMedicalCode;

    public Patient(String name, byte age, String gender){
        super(name);
        this.age = age;
        this.gender = gender;
        this.code = totalPacients;
        totalPacients++;

    }

    //Getters//
    public byte getAge(){
        return age;

    }
    public String getGender(){
        return gender;

    }
    @Override
    public String getStatus(){
        return PatientStatus.getStatus(statusCode).getStatusName();

    }
    public boolean isSmokes(){
        return smokes;

    }
    public boolean isSexLife(){
        return sexLife;

    }
    public boolean isAlcoholConsumption(){
        return alcoholConsumption;

    }
    public boolean isObesity(){
        return obesity;

    }
    public boolean isPregnant(){
        return pregnant;

    }
    public List<String> getSymptons(){
        return symptons;

    }
    public List<String> getSurgeries(){
        return surgeries;

    }
    public List<String> getchronicDiseases(){
        return chronicDiseases;

    }
    public List<String> getContinuousMeds(){
        return continuousMeds;

    }
    public List<String> getPatientInfo(){
        return patientInfo;

    }

    //Setters//
    public void setSmokes(boolean smokes){
        this.smokes = smokes;

    }
    public void setSexLife(boolean sexLife){
        this.sexLife = sexLife;

    }
    public void setAlcoholConsumption(boolean alcoholConsumption){
        this.alcoholConsumption = alcoholConsumption;

    }
    public void setObesity(boolean obesity){
        this.obesity = obesity;

    }
    public void setPregnant(boolean pregnant){
        this.pregnant = pregnant;

    }
    public void setSymptons(String symptons) {
        this.symptons.add(symptons);

    }
    public void setSurgeries(String surgeries) {
        this.surgeries.add(surgeries);

    }
    public void setChronicDiseases(String chronicDiseases) {
        this.chronicDiseases.add(chronicDiseases);

    }
    public void setContinuousMeds(String continuousMeds){
        this.continuousMeds.add(continuousMeds);

    }
    public void setPatientInfo(String patientInfo){
        this.patientInfo.add(patientInfo);

    }

}
