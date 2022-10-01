package org.demo.service;

import org.demo.dao.MessageDAO;
import org.demo.model.Message;

public class MessageService {
	private static MessageDAO messageDAO=new MessageDAO();
	public void writeMessageService(Message msg) {
		MessageService.messageDAO.writeData(msg);
	}

}
