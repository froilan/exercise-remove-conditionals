package com.IrvinGil.excercise.messaging;

import com.IrvinGil.excercise.ContactClass;

public class Fax implements MessageInterface {
    @Override
    public void sendMessage(String message, ContactClass contact) {
        //code for sending fax
        System.out.printf("Sending %s to %s from %s via fax\n"
                , message, contact.getPhoneNumber(), contact.getName());
    }
}
