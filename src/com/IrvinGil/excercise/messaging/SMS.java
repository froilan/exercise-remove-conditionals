package com.IrvinGil.excercise.messaging;

import com.IrvinGil.excercise.ContactClass;

public class SMS implements MessageInterface {
    @Override
    public void sendMessage(String message, ContactClass contact) {
        //code for sending sms
        System.out.printf("Sending %s to %s from %s via sms\n"
                , message, contact.getPhoneNumber(), contact.getName());
    }
}
