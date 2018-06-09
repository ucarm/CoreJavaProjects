package readFilesWithExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingTxtTheOldWay {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		FileReader fr =null;
		BufferedReader br= null; 
		try {
			fr = new FileReader("Numbers2.txt");
			br= new BufferedReader(fr); 
			int index=0;
//			This is one way to read code from txt file
			while(br.ready()) {
				System.out.print(++index+":");
				System.out.println(br.readLine());	
			}
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		catch(IOException e){
			e.printStackTrace();
		}
			
		finally {
		System.out.println("Ended..");
			try {
			br.close();
			fr.close();
			}catch(Exception e1) {
				e1.getMessage();
			}
		}
	}

}




//Second way to read from the file
//String line="";
//while((line=br.readLine())!=null) {
//	System.out.print(++index+":");
//	System.out.println(line);
//	
//}