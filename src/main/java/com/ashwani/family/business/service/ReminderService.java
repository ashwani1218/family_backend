package com.ashwani.family.business.service;

import com.ashwani.family.infra.model.response.PaymentRemindersResponse;

public interface ReminderService {
    PaymentRemindersResponse getAllPaymentReminders();

    PaymentRemindersResponse getTodayPaymentReminders();
}
