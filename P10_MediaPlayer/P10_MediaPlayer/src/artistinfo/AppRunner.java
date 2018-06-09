/*
 * AppRunner class provides the way to call the methods in your ArtistTracker class
 * You can use this to test your output before running Junit Test
 * 
 * */


package artistinfo;

public class AppRunner {

	public static void main(String[] args) {
		
		ArtistTracker tracker = new ArtistTracker();
		
		System.out.println("-------display all of them----- -----");
		tracker.displayAllArtistsInfo();
		
		System.out.println("-------moreThan100Club-------- count -----");
		 int moreThan100Club =  tracker.getTheCountOfArtistHaveMorethan100Song();
		 System.out.println(moreThan100Club);
		 
		 
		 System.out.println("-------printNamesOfArtistsHave_N_Song--------  -----"); 
		 tracker.printNamesOfArtistsHave_N_Song(29);
		 
		 System.out.println("-------getTotalSongCount--------  -----"); 
		 long sumOfAll =  tracker.getTotalSongCount();
		 System.out.println(sumOfAll);
		 
		 System.out.println("-------getArtistsSongCount--------  -----"); 
		 int songCount =  tracker.getArtistsSongCount("Wiz Khalifa");
		 System.out.println(songCount);
		 
		 System.out.println("-------checkIfArtistAlreadyExists-------------"); 
		 Artist artst =  new Artist();
		 artst.setName("Sam Smith");
		 artst.setSongCount(141);	 
		 boolean existsOfNot =  tracker.checkIfArtistAlreadyExists(artst) ; 
		 System.out.println("Artist exits in array : "+ existsOfNot);
		 
		 System.out.println("-------findRandomArtists-------------"); 
		 Artist randomArtist = tracker.findRandomArtists();
		 randomArtist.displayInfo();
		//  you can also call it directly as below
		 tracker.findRandomArtists().displayInfo();
		 System.out.println("-------getTheNameOfMostProductiveArtists-------------"); 
		 String mostProductiveArtist = tracker.getTheNameOfMostProductiveArtists();
		 System.out.println(mostProductiveArtist);

		 System.out.println("-------getTheLowestSongCount-------------"); 
		 int lowestSongCount = tracker.getTheLowestSongCount();
		 System.out.println(lowestSongCount);

	}

}
