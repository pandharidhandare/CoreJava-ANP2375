package org.demo.dao;

import java.io.RandomAccessFile;

import org.demo.model.Message;

import java.io.IOException;

public class MessageDAO {
	private static RandomAccessFile raf;
	static {
		
		try {
			raf = new RandomAccessFile("message.txt", "rw");
		} catch (IOException e) {

		}
	}

	public void writeData(Message msg){
		try {
		raf.writeBytes(msg.getMyMessage());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
