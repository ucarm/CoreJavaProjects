/*
 *  Unless you finish this Task , there will be compiler error in test 
 *   
 * 
 * Each Artist is represented by instance of Artists class , aka Artist Object
 * any artist have 2 attribute name, song count : private instance fields
 * getters and setters are provided for the instance field
 * Artists have another behaviour : displayInfo which will print out the info
 * display method take no arguments/parameter and return nothing.
 * the implementation is already provided.
 * 
 * Your Task in this class :
 * 
 * 1, Create no argument constructor --> just print creating empty artists
 * 2, Create 2 arguments constructor --> assign the private fields value
 * 3, Optionally : try to call no arg constructor in first line of second constructor
 * 
 * */

package artistinfo;

public class Artist {

	private String name; 
	private int songCount;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSongCount() {
		return songCount;
	}
	public void setSongCount(int songCount) {
		this.songCount = songCount;
	}
	
	public void displayInfo() {
		System.out.println("Artist [name=" + name + ", songCount=" + songCount + "]");
	}
	
	public Artist() {
		name="";
		songCount=0;
	}
	public Artist(String zname, int zsongs) {
		name=zname;
		songCount=zsongs;
	}
	
	
}
