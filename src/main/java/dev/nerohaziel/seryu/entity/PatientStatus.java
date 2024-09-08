package dev.nerohaziel.seryu.entity;

public enum PatientStatus{
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
    DISCHARGED((byte) 11,"Alta"),
    VISITOR((byte) 12,"Visitante");

    // Melhorias futuras: Armazenar visitas do paciente, para que não seja necessário criar um novo cadastro toda vez que ele vier ao hospital, mas sim aproveitar o cadastro de uma vinda anterior dele.

    private final byte statusCode;
    private final String statusName;

    PatientStatus(byte statusCode, String status){
        this.statusCode = statusCode;
        this.statusName = status;

    }

    public String getStatusName(){
        return statusName;

    }

    public static PatientStatus getStatus(byte code){
        for (PatientStatus status : PatientStatus.values()){
            if(status.statusCode == code){
                return status;

            }

        } throw new IllegalArgumentException("Status Inválido: " + code);

    }
    // Nota: Descobrir como colocar herança em ENUM para reaproveitar este método que se repete em "MedicalStatus"

}
