package readFilesWithExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class autoClose {
	public static void main(String[] args) {
//		TRY-WITH Resources
//		This will automatically close the opened files
			try(FileReader fr = new FileReader("Numbers2.txt");
				BufferedReader br= new BufferedReader(fr); )
			{
				
				int index=0;
//				This is one way to read code from txt file
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
				
			}
		}
}
