package inheritence;

public class Message {

	private String title;
	public static int count=0;
	{
		count++;
	}
	public Message(String title) {
		setTitle(title);
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	
	
}
