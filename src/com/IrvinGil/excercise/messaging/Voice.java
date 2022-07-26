package com.IrvinGil.excercise.messaging;

import com.IrvinGil.excercise.ContactClass;

public class Voice implements MessageInterface {
    @Override
    public void sendMessage(String message, ContactClass contact) {
        //code for sending voice
        System.out.printf("Sending %s to %s from %s via voice\n"
                , message, contact.getPhoneNumber(), contact.getName());
    }
}
