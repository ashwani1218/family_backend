package com.ashwani.family.util.constants;

public class ResponseConstants {




    private ResponseConstants(){}
    //Response Code
    public  static final String SUCCESS_CODE = "200";
    public  static final String SUCCESS_CODE_EMPTY_RESPONSE = "204";
    public static final String SUCCESS_REGISTRATION_CODE = "201";

    public static final String FAILURE_CODE = "400";
    public static final String UNAUTHENTIC_CODE = "401";
    public static final String ALREADY_USER_CODE = "402";
    public static final String NOT_FOUND_CODE = "404";

    //Response Status
    public static final String SUCCESS_STATUS = "SUCCESS";
    public static final String FAILED_STATUS = "FAILED";

    //Response description
    public static final String ADD_MEMBER_SUCCESS = "Member Added Successfully";
    public static final String ADD_MEMBER_FAILURE = "Unable to add Member";

    public static final String ADD_DOCUMENT_SUCCESS = "Document Added Successfully";
    public static final String ADD_DOCUMENT_FAILURE = "Unable to add Document";
    public static final String GET_DOC_TYPE_SUCCESS = "Doc types fetched successfully";
    public static final String ADD_DOC_TYPE_SUCCESS = "Document Type added successfully";
    public static final String ADD_DOCUMENT_TYPE_FAILURE = "Unable to add Document type";
}
