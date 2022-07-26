package com.IrvinGil.excercise.messaging;

import com.IrvinGil.excercise.ContactClass;

public class Email implements MessageInterface {
    @Override
    public void sendMessage(String message, ContactClass contact) {
        //code for sending email
        System.out.printf("Sending %s to %s from %s via email\n"
                , message, contact.getEmailAddress(), contact.getName());
    }

}
