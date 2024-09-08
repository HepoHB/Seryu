package dev.nerohaziel.seryu.entity;

public enum MedicalStatus{
    WORKING((byte) 0,"Em Serviço"),
    HOLIDAY((byte) 1,"De Folga"),
    OUT((byte) 2,"Ausente"),
    VACATION((byte) 3,"Férias"),
    RETIRED((byte) 4, "Aposentado"),
    DETACHED((byte) 5,"Afastado");

    private final byte statusCode;
    private final String statusName;

    MedicalStatus(byte statusCode, String statusName) {
        this.statusCode = statusCode;
        this.statusName = statusName;

    }

    public String getStatusName(){
        return statusName;

    }

    public static MedicalStatus getStatus(byte code) {
        for (MedicalStatus status : MedicalStatus.values()) {
            if (status.statusCode == code) {
                return status;

            }

        }
        throw new IllegalArgumentException("Status Inválido: " + code);

    }
    // Nota: Descobrir como colocar herança em ENUM para reaproveitar este método que se repete em "PatientStatus"

}
