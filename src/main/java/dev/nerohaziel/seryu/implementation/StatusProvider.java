package dev.nerohaziel.seryu.implementation;

import dev.nerohaziel.seryu.entity.PatientStatus;

public interface StatusProvider{
    byte getStatusCode();

    String getStatusName();

    static <T extends StatusProvider> T getStatus(byte code, T[] values){
        for (T status : values){
            if (status.getStatusCode() == code) {
                return status;

            }

        }
        throw new IllegalArgumentException("Status Inválido: " + code);

    }

}
