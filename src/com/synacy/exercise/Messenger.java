package com.synacy.exercise;


/**
 * Refactor so you don't have to have an if statement here. You can change/create anything.
 * Only requirement is the functionality is retained.
 *
 * */
public class Messenger {

	public void sendMessage(Message message) {
//		if (type.equals(MessageType.FAX)) {
//			System.out.printf("Sending %s to %s from %s via fax\n", message, contact.getPhoneNumber(), contact.getName());
//		} else if (type.equals(MessageType.EMAIL)) {
//			System.out.printf("Sending %s to %s from %s via email\n", message, contact.getEmailAddress(), contact.getName());
//		} else if (type.equals(MessageType.SMS)) {
//			System.out.printf("Sending %s to %s from %s via sms\n", message, contact.getPhoneNumber(), contact.getName());
//		} else if (type.equals(MessageType.VOICE)) {
//			System.out.printf("Sending %s to %s from %s via call\n", message, contact.getPhoneNumber(), contact.getName());
//		}
		message.send();


	}

}
