package com.IrvinGil.excercise.messaging;

import com.IrvinGil.excercise.ContactClass;
import com.IrvinGil.excercise.TypeOfMessage;

public class MessengerClass {
    public void decideModeOfDelivery(String message, ContactClass contact, TypeOfMessage type) {
        switch (type){
            case EMAIL:
                new Email().sendMessage(message,contact);
                break;
            case FAX:
                new Fax().sendMessage(message,contact);
                break;
            case SMS:
                new SMS().sendMessage(message,contact);
                break;
            case VOICE:
                new Voice().sendMessage(message,contact);
                break;
        }
    }

}
