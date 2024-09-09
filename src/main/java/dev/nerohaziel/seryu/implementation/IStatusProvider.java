package dev.nerohaziel.seryu.implementation;

public interface IStatusProvider {
    byte getStatusCode();

    String getStatusName();

    static <T extends IStatusProvider> T getStatus(byte code, T[] values){
        for (T status : values){
            if (status.getStatusCode() == code) {
                return status;

            }

        }
        throw new IllegalArgumentException("Status Inválido: " + code);

    }

}
