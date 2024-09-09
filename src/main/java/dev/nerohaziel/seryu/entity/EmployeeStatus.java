package dev.nerohaziel.seryu.entity;

import dev.nerohaziel.seryu.implementation.IStatusProvider;

public enum EmployeeStatus implements IStatusProvider {
    WORKING((byte) 0,"Em Serviço"),
    HOLIDAY((byte) 1,"De Folga"),
    OUT((byte) 2,"Ausente"),
    VACATION((byte) 3,"Férias"),
    RETIRED((byte) 4, "Aposentado"),
    DETACHED((byte) 5,"Afastado");

    private final byte statusCode;
    private final String statusName;

    EmployeeStatus(byte statusCode, String statusName){
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

    public static EmployeeStatus getStatus(byte code){
        return IStatusProvider.getStatus(code, EmployeeStatus.values());

    }

}
