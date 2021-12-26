package com.ashwani.family.business.controller;

import com.ashwani.family.business.service.ReminderService;
import com.ashwani.family.infra.model.response.PaymentRemindersResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/reminders")
@CrossOrigin("*")
@Slf4j
public class ReminderController {

    @Autowired
    private ReminderService reminderService;

    @GetMapping("/payments")
    public PaymentRemindersResponse remind(){
        log.info("Payments reminder request");
        return reminderService.getAllPaymentReminders();
    }

    @GetMapping("/today")
    public PaymentRemindersResponse today(){
        log.info("Payment Reminders for Today");
        return reminderService.getTodayPaymentReminders();
    }
}
