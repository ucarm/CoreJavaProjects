package Messages;

public class IMessage extends Message {
	
	public IMessage(String sender,String receiver, String messageBody) {

	    setType("IMessage");

	    setSender(sender);

	    setReceiver(receiver);

	    setMessageBody(messageBody);

	  }
}
