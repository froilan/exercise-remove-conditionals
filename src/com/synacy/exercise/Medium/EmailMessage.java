package com.synacy.exercise.Medium;

import com.synacy.exercise.Contact;
import com.synacy.exercise.Message;

public class EmailMessage implements Message {
    private Contact contact;
    private String  message;
    public EmailMessage(String message, Contact contact) {
        this.message = message;
        this.contact =contact;
    }

    @Override
    public void send() {
        System.out.printf("Sending %s to %s from %s via email\n", message, contact.getEmailAddress(), contact.getName());
    }
}
