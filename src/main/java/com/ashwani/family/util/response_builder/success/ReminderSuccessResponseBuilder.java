package com.ashwani.family.util.response_builder.success;

import com.ashwani.family.infra.entity.MemberDocument;
import com.ashwani.family.infra.model.response.BaseResponse;
import com.ashwani.family.infra.model.response.PaymentRemindersResponse;
import com.ashwani.family.util.constants.ResponseConstants;
import com.ashwani.family.util.response_builder.BaseSuccessResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReminderSuccessResponseBuilder {

    @Autowired
    private BaseSuccessResponseBuilder baseSuccessResponseBuilder;


    public PaymentRemindersResponse payments(List<MemberDocument> documents){
        BaseResponse baseResponse = baseSuccessResponseBuilder.baseSuccessResponse();
        return PaymentRemindersResponse.builder()
                .httpStatus(baseResponse.getHttpStatus())
                .responseCode(baseResponse.getResponseCode())
                .status(baseResponse.getStatus())
                .responseDescription(ResponseConstants.SUCCESS_STATUS)
                .documents(documents).build();

    }

}