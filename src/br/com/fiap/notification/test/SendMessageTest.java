package br.com.fiap.notification.test;

import com.facebook.whatsapp.InvalidLoginException;
import com.facebook.whatsapp.InvalidMessageException;
import com.facebook.whatsapp.InvalidPhoneException;
import com.facebook.whatsapp.WhatsAppMessage;

public class SendMessageTest {

	public static void main(String[] args) {

		// alt shift s

		WhatsAppMessage whatsAppMessage = new WhatsAppMessage();

		try {
			whatsAppMessage.sendMessage("riane@test", "+55 11 912345678", "Message Test");

		} catch (InvalidLoginException e) {
			System.out.println("Unable to login.");

		} catch (InvalidPhoneException e) {
			System.out.println("Wrong phone.");

		} catch (InvalidMessageException e) {
			System.out.println("Invalid message.");

		} finally {
			System.out.println("End of execution.");
		}

	}

}
