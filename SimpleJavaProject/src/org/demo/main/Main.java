package org.demo.main;

import org.demo.view.MessageView;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main Method");
		MessageView mv=new MessageView();
		mv.createMessage();
	}

}
