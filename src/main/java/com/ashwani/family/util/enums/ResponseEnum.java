package com.ashwani.family.util.enums;

public enum ResponseEnum {

    SUCCESS (200, "Success");

    private final int code;
    private final String message;

    ResponseEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
