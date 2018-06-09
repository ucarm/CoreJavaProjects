package exceptions;

public class MultiCatch {

  public static void main(String[] args) {
    
    //// Task 2 
    
    /*
     * Write a code that might throw either ClassCastException
     *   or ArithmaticException or NullPointerException 
     *   
     *   and try to catch them in 3 different catch blocks
     * 
     * 
     * 
     * 
     * */

    System.out.println("beginning    ");
    
    int[] arr = new int[4];
    int i = 0 ; 
    String str = null;
    try {
      
//      str.concat("AA");
      System.out.println("index 3 item value of array "+ arr[3] );
//      System.out.println(6 / i);
      System.out.println(arr[4]);
      
    }catch(ArithmeticException e) {
      
      System.out.println(" Arithmetic Exception ");
      System.out.println(  6 / ++i   );
      
    
    }
//    catch(ArrayIndexOutOfBoundsException e1) {
//
//      System.out.println("array index out of bound");
//      
//    }
    catch(NullPointerException e2) {
    	System.out.println(e2);
    	System.out.println( 6/0 );
    }catch(ClassCastException e3) {
    	System.out.println("Classcast Exceptiopns");
    	
    }catch(RuntimeException e) {
    	System.out.print("Any other exceptions =>\t");
    	System.out.println(e);
    }

    System.out.println("done");
    
  }

}


// Shared via @Webclipse. To open this file type:
// /code-open MultiCatch.java 1-50 Q1lcPQ