/*
 * ArtistsTracker class
 * 
 * This class have one private instance field allArtists as Artists array (just like String array)
 * Once ArtistsTracker class is instantiated (aka , an ArtistTracker object is created)  -
 * The allArtists instance field will be loaded with 47 artists Object with name and Song count 
 * defined in ArtistsSongCount.txt 
 * 
 * So your Job is implement empty methods defined as below as the requirement.
 * REMEMBER : All the methods will use allArtist instance field/variable
 * 
 * I provided The AppRunner class in same package that use these methods
 * So you can uncomment one by one to test each method output separately 
 * 
 * The Test is written against ArtistsTracker functionality
 * Once you are done run the ArtistTrackerTest.java file as Junit to see your result
 * 
 * */


package artistinfo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class ArtistTracker {

	private Artist[] allArtists;
	
	/*
	 * This no argument. Constructor is already provided , no need to do anything 
	 * loadAllArtists method is being called in constructor to 
	 * load up all artists to your Artist[] allArtists;
	 * 
	 */
	
	public ArtistTracker() {	
		loadAllArtists();
	}
	
	/*
	 * 
	 * Task : This is the getter for allArtists -> fill the method body
	 * 
	 * */
	
	public Artist[] getAllArtists() {
		/// Your Code Goes Here
		return allArtists;
	}

	/*
	 * Task  : This method should print all artist info using display Method
	 * 
	 */
	public void displayAllArtistsInfo() {
		/// Your Code Goes Here
		for(int i=0; i<allArtists.length; i++)
			allArtists[i].displayInfo();
	}

	/*
	 * Task : This method will return count of artists that have more than 100 song as int
	 * 
	 */
	public int getTheCountOfArtistHaveMorethan100Song() {
		int count =0;
		for(int i=0; i<allArtists.length; i++) {
			if(allArtists[i].getSongCount()>100)
				count++;
		}
			
		return count;
	}

	/*
	 * Task : This method will print Names Of Artists who has song count match 
	 * the passed parameter value n when being called in App Runner
     *
	 */
	public void printNamesOfArtistsHave_N_Song(int n) {
		/// Your Code Goes Here
		for(int i=0; i<allArtists.length; i++) {
			if(allArtists[i].getSongCount()==n) {
				System.out.println(allArtists[i].getName());
			}
			
		}
	}

	/*
	 * Task : this method will calculate total number of song from all artists
	 * 
	 */
	public long getTotalSongCount() {
		/// Your Code Goes Here
		int totalSongs=0;
		for(int i=0; i<allArtists.length; i++) {
			totalSongs+=allArtists[i].getSongCount();
		}
		return totalSongs;
	}

	/*
	 * Task : this method will take an Artist object as parameter
	 * 		  if this object is null it will return false
	 *        only if the passed artist object have SAME NAME AND SAME SONG COUNT
	 *        it will return true , otherwise it will return false
	 * 
	 */
	public boolean checkIfArtistAlreadyExists(Artist target) {
		/// Your Code Goes Here
		for(int i=0; i<allArtists.length; i++) {
			//if (allArtists[i].getName().equals(target.getName()) && allArtists[i].getSongCount()==target.getSongCount())
			if(allArtists[i].equals(target))
				return true;
		}
		
		return false; 
	}
	
	/*
	 * Task : this method will take an artist name as parameter
	 *        if no artists with such name found in allArtists it will return 0
	 *        it will return the song count if artist with such name found
	 * 
	 */
	public int getArtistsSongCount(String name) {
		/// Your Code Goes Here
		int result=0;
		for(int i=0; i<allArtists.length; i++) {
			if (allArtists[i].getName().equals(name))
				result+=allArtists[i].getSongCount();
		}
		return result;
	}

	/*
	 * Task : this method will return a random Artist object from the list 
	 * 		  hint : in order to access an array item we use index 
	 * 		  so if we can get random index  within the range of all artistArray 
	 * 		  each time the method is called , we will have random artist each time 		 
	 * 	      so the key is getting a random index using Random Class as below
	 * 		  Random rd = new Random();
	 * 		  int randonIndex = rd.nextInt(allArtists.length);
	 * 		  and remember it will return an Artist object 
	 * 
	 */
	
	public Artist findRandomArtists() {
		/// Your Code Goes Here
		Random rand= new Random();
		int randIndex= rand.nextInt(allArtists.length);
		return allArtists[randIndex];
	}
	
	/*
	 * Task : this method will compare each Artist song count in array 
	 *        and return the artist name with maximum song count 
	 *        hint : find maxSong count and index of Artist for that songCount
	 * 
	 */
	
	public String getTheNameOfMostProductiveArtists() {
		// TODO Auto-generated method stub
		//String result="";
		int max=0;
		int maxIndex=0;
		for(int i=0; i<allArtists.length; i++) {
			if(allArtists[i].getSongCount()>max) {
				max=allArtists[i].getSongCount();
				maxIndex= i;
			}
		}
		return allArtists[maxIndex].getName();
	}

	/*
	 * Task : this method will compare each Artist song count in array 
	 *        and return the lowest song count 
	 * 
	 */
	public int getTheLowestSongCount() {
		// TODO Auto-generated method stub
		int min=1000000000;
		for(int i=0; i<allArtists.length; i++) {
			if(allArtists[i].getSongCount()<min) {
				min=allArtists[i].getSongCount();
			}
		}
		return min;
		
	}
	

	/*
	 * Purpose of this method is loading all the Artists from text file
	 * ArtistSongCount.txt in project to the Artist array 
	 * allArtists instance field Once, you will have array of Artists Objects
	 * with the name and song count set.
	 * Once ArtistTracker object is created 
	 * this method can be called to load Artists
	 * 
	 * DO NOT CHANGE
	 */


	public void loadAllArtists() {

		String artistFile = "./ArtistSongCount.txt";

		try {

		 allArtists = 
			Files.lines(Paths.get(artistFile))
			  .map(eachline -> eachline.split(","))
			  .map(eachArray-> new Artist(eachArray[0],Integer.parseInt(eachArray[1]) ) )
			  .toArray(size -> new Artist[size]);

		} catch (IOException e) {
			e.printStackTrace();

		}

	}



}
