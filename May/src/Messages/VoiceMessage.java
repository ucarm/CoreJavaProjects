package Messages;

public class VoiceMessage extends Message {
	public VoiceMessage(String sender,String receiver, String messageBody) {

	    setType("VoiceMessage");

	    setSender(sender);

	    setReceiver(receiver);

	    setMessageBody(messageBody);

	  }
}
