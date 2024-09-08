package dev.nerohaziel.seryu.core;

public enum Status{
    WAITING((byte) 0,"Sala de Espera"),
    SCREENING((byte) 1,"Triagem"),
    APPOINTMENT((byte) 2,"Consulta"),
    INFUSION((byte) 3,"Sala de Infusão"),
    INHALATION((byte) 4, "Sala de Nebulização"),
    EXAMINATION ((byte) 5,"Sala de Exames"),
    CLINICAL((byte) 6,"Laboratório de Análises Clínicas"),
    ICU((byte) 7, "Unidade de Terapia Intensiva"),
    SPECIALITY((byte) 8,"Clínica de Especialidades"),
    HOSPITALIZATION((byte) 9,"Unidade de Internação"),
    REHABILITATION((byte) 10,"Centro de Reabilitação"),
    VISITOR((byte) 11,"Visitante");

    private final byte statusCode;
    private final String statusName;

    Status(byte statusCode, String status){
        this.statusCode = statusCode;
        this.statusName = status;

    }

    public String getStatusName(){
        return statusName;

    }

    public static Status getStatus(byte code){
        for (Status status : Status.values()){
            if(status.statusCode == code){
                return status;

            }

        } throw new IllegalArgumentException("Status Inválido: " + code);

    }



}
