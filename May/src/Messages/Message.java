package Messages;

public class Message {
	
	private String sender;
	private String receiver;
	private String type;
	private String messageBody;	
	
	{
		sender="Unknown";
		receiver ="unknown";
		type="unknown";
		messageBody="";
	}
	
	public void send() {
		if(sender.equals("unknown") || receiver.equals("unknown") || messageBody.isEmpty()){
			System.out.println("Error : Message sending failure\n\n");
			return;
		}
		String str= "Message sent successfully\n"+
					"[Sender="+sender+"]\n"+
					"[Receiver= "+receiver+"]\n"+
					"[Type="+type+"]\n"+
					"[MessageBody="+messageBody+"]\n\n";
				
		System.out.println(str);
	}
	
	
	public void reply(String messageBody) {
		String sender = getReceiver();
		setReceiver(getSender());
		setSender(sender);
		setMessageBody(messageBody);
		send();
		
	}
	
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public String getMessageBody() {
		return messageBody;
	}

	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

}
