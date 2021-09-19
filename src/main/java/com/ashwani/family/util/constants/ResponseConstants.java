package com.ashwani.family.util.constants;

import org.springframework.stereotype.Component;

@Component
public class ResponseConstants {

    //Response Code
    public  final String SUCCESS_CODE = "200";
    public  final String SUCCESS_CODE_EMPTY_RESPONSE = "204";
    public  final String SUCCESS_REGISTRATION_CODE = "201";

    public  final String FAILURE_CODE = "400";
    public  final String UNAUTHENTIC_CODE = "401";
    public  final String ALREADY_USER_CODE = "402";
    public  final String NOT_FOUND_CODE = "404";

    //Response Status
    public  final String SUCCESS_STATUS = "SUCCESS";
    public  final String FAILED_STATUS = "FAILED";

    //Response description
    public final String ADD_MEMBER_SUCCESS = "Member Added Successfully";
    public final String ADD_MEMBER_FAILURE = "Unable to add Member";

    public final String ADD_POLICY_SUCCESS = "Policy Added Successfully";
    public final String ADD_POLICY_FAILURE = "Unable to add Policy";

}
