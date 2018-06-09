package people;

import java.util.ArrayList;
import java.util.List;

import books.Book;
import booksmanager.BooksManager;

public class Reader {
  private String name;
  private String plan;
  
  //reading, listening
  List<Book> reading = new ArrayList<>();
  List<Book> listening = new ArrayList<>();
  
  public Reader(String name, String plan) {
    super();
    this.name = name;
    this.plan = plan;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPlan() {
    return plan;
  }

  public void setPlan(String plan) {
    this.plan = plan;
  }

  public List<Book> getReading() {
    return reading;
  }

  public boolean addReading(Book book) {
    if(plan.equalsIgnoreCase(BooksManager.LIMITED)) {
      if(reading.size()<BooksManager.LIMITED_PLAN_LIMIT) {
    	  reading.add(book);
    	  return true;
      }else {
    	  System.out.println(name+ " Reached account limit.Can't add "+book.getTitle());
    	  return false;
      }
    }
    	reading.add(book);
    	return true;
  }

  public List<Book> getListening() {
    return listening;
  }

  public boolean addListenning(Book book) {
	    if(plan.equalsIgnoreCase(BooksManager.LIMITED)) {
	      if(reading.size()<BooksManager.LIMITED_PLAN_LIMIT) {
	    	  reading.add(book);
	    	  return true;
	      }else {
	    	  System.out.println(name+ " Reached account limit.Can't add "+book.getTitle());
	    	  return false;
	      }
	    }
	    	reading.add(book);
	    	return true;
	  }
  
  public String toString() {
	  return name+" - "+plan;
  }
  
}


// Shared via @Webclipse. To open this file type:
// /code-open Reader.java 1-60 RjFYpA