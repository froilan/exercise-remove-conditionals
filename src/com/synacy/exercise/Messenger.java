package com.synacy.exercise;


/**
 * Refactor so you don't have to have an if statement here. You can change/create anything.
 * Only requirement is the functionality is retained.
 *
 * */
public class Messenger {
	public void sendMessage(String message, Contact contact, MessageType type) {
		System.out.printf("Sending %s to %s from %s via %s \n", message, contact.getPhoneNumber(), contact.getName(), type.toString());
	}
}
