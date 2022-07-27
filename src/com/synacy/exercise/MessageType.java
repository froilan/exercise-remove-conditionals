package com.synacy.exercise;

public enum MessageType implements Message{
	FAX, SMS, EMAIL, VOICE;

	@Override
	public void send() {

	}

}
