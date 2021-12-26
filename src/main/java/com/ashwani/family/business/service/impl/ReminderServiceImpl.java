package com.ashwani.family.business.service.impl;

import com.ashwani.family.business.service.ReminderService;
import com.ashwani.family.infra.entity.MemberDocument;
import com.ashwani.family.infra.model.response.PaymentRemindersResponse;
import com.ashwani.family.infra.repository.MemberDocumentRepository;
import com.ashwani.family.util.response_builder.success.ReminderSuccessResponseBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class ReminderServiceImpl implements ReminderService {

    @Autowired
    private MemberDocumentRepository documentRepository;

    @Autowired
    private ReminderSuccessResponseBuilder successResponseBuilder;

    @Override
    public PaymentRemindersResponse getAllPaymentReminders() {
        List<MemberDocument> documents = documentRepository.findFromToday(new Date());
        return successResponseBuilder.payments(documents);
    }

    @Override
    public PaymentRemindersResponse getTodayPaymentReminders() {
        List<MemberDocument> documents = documentRepository.findBetween(new Date(),new Date(new Date().getTime() + (1000 * 60 * 60 * 24)));
        return successResponseBuilder.payments(documents);
    }
}
