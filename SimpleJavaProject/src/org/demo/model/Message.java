package org.demo.model;

import java.util.Objects;

public class Message {
private String myMessage;

public Message(String myMessage) {
	super();
	this.myMessage = myMessage;
}

public Message() {
	super();
	// TODO Auto-generated constructor stub
}

public String getMyMessage() {
	return myMessage;
}

public void setMyMessage(String myMessage) {
	this.myMessage = myMessage;
}

@Override
public String toString() {
	return "Message [myMessage=" + myMessage + "]";
}

@Override
public int hashCode() {
	return Objects.hash(myMessage);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Message other = (Message) obj;
	return Objects.equals(myMessage, other.myMessage);
}

}
