package com.facebook.whatsapp;

public class WhatsAppMessage {

	public void sendMessage(String login, String to, String textMessage)
			throws InvalidLoginException, InvalidPhoneException, InvalidMessageException {

		if (!login.equals("riane@test")) {
			throw new InvalidLoginException();
		}

		if (!to.startsWith(("+"))) {
			throw new InvalidPhoneException();
		}

		if (textMessage.isBlank()) {
			throw new InvalidMessageException();
		}

		System.out.println("Sending message: " + textMessage + " para " + to);

	}
}
