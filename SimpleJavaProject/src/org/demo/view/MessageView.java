package org.demo.view;

import java.util.Scanner;

import org.demo.model.Message;
import org.demo.service.MessageService;

public class MessageView {
	static int a;
	static MessageService service=new MessageService();
	public void createMessage() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter message :");
		String msg=sc.nextLine();
		Message messageObj=new Message(msg);
		MessageView.service.writeMessageService(messageObj);
}
}
