package com.synacy.exercise.Medium;

import com.synacy.exercise.Contact;
import com.synacy.exercise.Message;

public class VoiceMessage implements Message {
    private Contact contact;
    private String message;
    public VoiceMessage(String message, Contact contact) {
        this.message = message;
        this.contact = contact;
    }

    @Override
    public void send() {
        System.out.printf("Sending %s to %s from %s via call\n", message, contact.getPhoneNumber(), contact.getName());

    }
}
