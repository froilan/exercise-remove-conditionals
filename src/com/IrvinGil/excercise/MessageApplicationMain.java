package com.IrvinGil.excercise;

import com.IrvinGil.excercise.messaging.MessengerClass;

public class MessageApplicationMain {
    public static void main(String[] args) {
        MessengerClass messenger = new MessengerClass();

        ContactClass chuckee = ContactClass.stageUserInfo("chuckee", "631234567891", "chuckee.saliente@synacy.com");
        ContactClass june =ContactClass.stageUserInfo("june", "631234567892", "june.ligan@synacy.com");
        ContactClass len =ContactClass.stageUserInfo("len", "631234567893", "len.laurito@synacy.com");
        ContactClass von =ContactClass.stageUserInfo("von", "631234567894", "von.alino@synacy.com");

        messenger.decideModeOfDelivery("Hello world", chuckee, TypeOfMessage.FAX);
        messenger.decideModeOfDelivery("Hello world", june, TypeOfMessage.SMS);
        messenger.decideModeOfDelivery("Hello world", len, TypeOfMessage.EMAIL);
        messenger.decideModeOfDelivery("Hello world", von, TypeOfMessage.VOICE);

    }
}
