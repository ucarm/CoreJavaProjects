package Messages;

import java.util.ArrayList;
import java.util.List;

public class Conversations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> msgs = new ArrayList<>();
		msgs.add("Hello");
		msgs.add("Hi!");
		msgs.add("How are you");
		msgs.add("Learning java. U?");
		msgs.add("Also learning java");
		msgs.add("Bye take case");
		msgs.add("Bye. keep stdying java");
		
		IMessage imessage = new IMessage("sara", "Fatima", msgs.get(0));
		imessage.send();
		for (int i = 1; i < msgs.size(); i++) {
			imessage.reply(msgs.get(i));
		}
	}

}
