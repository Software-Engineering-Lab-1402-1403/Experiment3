package edu.sharif.selab.services;

import edu.sharif.selab.models.EmailMessage;
import edu.sharif.selab.models.SmsMessage;
import edu.sharif.selab.models.TelegramMessage;

public class TelegramMessageService implements MessageService {
    @Override
    public void sendSmsMessage(SmsMessage smsMessage) {
        //Empty Body
    }

    @Override
    public void sendEmailMessage(EmailMessage emailMessage) {
        //Empty Body
    }

    @Override
    public void sendTelegramMessage(TelegramMessage telegramMessage) {
        System.out.println("Sending a SMS from " + telegramMessage.getSourceTelegramId() + " to " + telegramMessage.getTargetTelegramId() + " with content : " + telegramMessage.getContent());
    }
}
