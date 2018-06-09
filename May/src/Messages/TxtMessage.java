package Messages;

public class TxtMessage extends Message{
	public TxtMessage() {
		setType("Text Message");
	}
	
	public TxtMessage(String sender,String receiver, String messageBody) {

	    setType("TextMessage");

	    setSender(sender);

	    setReceiver(receiver);

	    setMessageBody(messageBody);

	  }
	
	
//	public void reply(String messageBody) {
//		String sender = getReceiver();
//		setReceiver(getSender());
//		setSender(sender);
//		setMessageBody(messageBody);
//		send();
//		
//	}
//	
}
