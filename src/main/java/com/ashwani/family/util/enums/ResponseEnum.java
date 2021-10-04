package com.ashwani.family.util.enums;

public enum ResponseEnum {

    SUCCESS (200, "Success"),
    ADD_MEMBER_SUCCESS(200,"Member Added Successfully"),
    ADD_MEMBER_FAILURE(409,"Unable to add Member"),
    ADD_DOCUMENT_SUCCESS(200, "Document Added Successfully"),
    ADD_DOCUMENT_FAILURE(409,"Unable to add Document"),
    GET_DOC_TYPE_SUCCESS(200,"Doc types fetched successfully"),
    ADD_DOC_TYPE_SUCCESS(200,"Document Type added successfully"),
    ADD_DOCUMENT_TYPE_FAILURE(409,"Unable to add Document type");

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
