package dev.nerohaziel.seryu.entity;

import dev.nerohaziel.seryu.implementation.StatusProvider;

public enum MedicalStatus implements StatusProvider{
    WORKING((byte) 0,"Em Serviço"),
    HOLIDAY((byte) 1,"De Folga"),
    OUT((byte) 2,"Ausente"),
    VACATION((byte) 3,"Férias"),
    RETIRED((byte) 4, "Aposentado"),
    DETACHED((byte) 5,"Afastado");

    private final byte statusCode;
    private final String statusName;

    MedicalStatus(byte statusCode, String statusName){
        this.statusCode = statusCode;
        this.statusName = statusName;

    }

    @Override
    public byte getStatusCode(){
        return statusCode;
    }

    @Override
    public String getStatusName(){
        return statusName;

    }

    public static MedicalStatus getStatus(byte code){
        return StatusProvider.getStatus(code, MedicalStatus.values());

    }

}
