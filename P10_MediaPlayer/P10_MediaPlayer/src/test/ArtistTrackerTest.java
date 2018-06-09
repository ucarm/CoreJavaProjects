package test;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import artistinfo.Artist;
import artistinfo.ArtistTracker;

@DisplayName("Testing Artist Tracker Class Functionality")
public class ArtistTrackerTest {

	ArtistTracker tracker;
	String artistFile = "./ArtistSongCount.txt";
	String allText;
	String lineSeperator = System.getProperty("line.separator");
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

	@BeforeAll
	public static void init() {
		// System.out.println("Test Has Started");

	}

	@BeforeEach
	public void setUp() {
		tracker = new ArtistTracker();
	}
	
	@DisplayName("Test Artist Class")
	@Test
	public void testArtistClass() {
		
		Artist artist1 = new Artist();
		Artist artist2 = new Artist("name",0);
		
	}

	@DisplayName(" Display all artists Test ")
	@Test
	public void testDisplayAllArtists() {
		
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
		tracker.displayAllArtistsInfo();

		try {

			final String expected = Files.lines(Paths.get(artistFile)).map(eachline -> {
				String[] artistDetails = eachline.split(",");
				return "Artist [name=" + artistDetails[0] + ", songCount=" + artistDetails[1] + "]";
			}).collect(Collectors.joining(lineSeperator)) + lineSeperator;

			assertAll("Multiple Check",
					() -> assertEquals(expected.split(lineSeperator).length, outContent.toString().split(lineSeperator).length),
					() -> assertArrayEquals(expected.split(lineSeperator), outContent.toString().split(lineSeperator)),
					() -> assertEquals(expected.length(), outContent.toString().length()),
					() -> assertEquals(expected, outContent.toString()));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@DisplayName("Get The Count Of Artists Have More than 100 Songs Test ")
	@Test
	public void testGetTheCountOfArtistHaveMorethan100Song() {

		int count = 0;

		try (Stream<String> lines = Files.lines(Paths.get(artistFile))
				.filter(line -> Integer.parseInt(line.split(",")[1]) > 100)) {

			count = (int) lines.count();
			assertEquals(count, tracker.getTheCountOfArtistHaveMorethan100Song(),
					"The count is calculated in correctly");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@DisplayName("Print The name Of Artists Have N Songs Test")
	@Test
	public void testPrintTheNameOfArtistThatHaveNSong() {

		String expected;
		int count = 29;
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));

		try (Stream<String> lineStream = Files.lines(Paths.get(artistFile))
				.filter(line -> Integer.parseInt(line.split(",")[1]) == count)
				.map(line -> line.split(",")[0])) {

			expected = lineStream.collect(joining(lineSeperator));
			tracker.printNamesOfArtistsHave_N_Song(count);

			assertEquals(expected.trim(), outContent.toString().trim());

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@DisplayName("Print The name Of Artists Have N Songs Negative Test")
	@ParameterizedTest(name = "print name of Artists that have <{0}> Song ")
	@ValueSource(ints = {0,-100,1000})
	public void testPrintTheNameOfArtistThatHaveNSongNegative(int count) {

		String expected="";
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));

		try (Stream<String> lineStream = Files.lines(Paths.get(artistFile))
				.filter(line -> Integer.parseInt(line.split(",")[1]) == count)
				.map(line -> line.split(",")[0])) {

			expected = lineStream.collect(joining(lineSeperator));
			tracker.printNamesOfArtistsHave_N_Song(count);
			assertTrue(outContent.toString().isEmpty());
			assertEquals(expected, outContent.toString());

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	@DisplayName("Print The name Of Artists Have N song Using CSV")
	@ParameterizedTest(name = "print name of Artists <{0}> that have <{1}> Song ")
	@CsvFileSource(resources = "/ArtistSongCount.csv", numLinesToSkip = 0)
	public void testPrintTheNameOfArtistThatHaveNSongCSV(String name,int count) {

		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
		tracker.printNamesOfArtistsHave_N_Song(count);
		try (Stream<String> nameStream = Files.lines(Paths.get(artistFile))
				.filter(line -> Integer.parseInt(line.split(",")[1])==count)
				.map(line ->line.split(",")[0])) {

			String expected = nameStream.collect(joining(lineSeperator));
			assertEquals(expected.trim(), outContent.toString().trim());

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@DisplayName(" Get The Total Count Of Songs Test ")
	@Test
	public void testGetTheTotalSongCount(TestReporter reporter) {

		int count = 0;

		try {

			count = (int) Files.lines(Paths.get(artistFile))
					.mapToInt(line -> Integer.parseInt(line.split(",")[1]))
					.sum();
			reporter.publishEntry("total song", String.valueOf(count));
			assertEquals(count, tracker.getTotalSongCount());

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@DisplayName("Get The Song Count Of Certain Artists Test ")
	@Test
	public void testGetArtistsSongCount() {

		String name = "Ed Sheeran";
		int count = 0;

		try (IntStream countSteam = Files.lines(Paths.get(artistFile))
				.filter(line -> line.split(",")[0].equals(name))
				.mapToInt(line -> Integer.parseInt(line.split(",")[1]))) {

			count = (int) countSteam.findFirst().getAsInt();
			assertEquals(count, tracker.getArtistsSongCount(name));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@DisplayName(" Get The Song Count Of Certain Artists Test Using CSV ")
	@ParameterizedTest(name = "Get Song Count for <{0}> at iteration : " 
					+ "{index} | Expecting Count==>{1}")
	@CsvFileSource(resources = "/ArtistSongCount.csv", numLinesToSkip = 0)
	public void testGetArtistsSongCountByCSV(String name, int count) {

		try (IntStream countSteam = Files.lines(Paths.get(artistFile))
				.filter(line -> line.split(",")[0].equals(name))
				.mapToInt(line -> Integer.parseInt(line.split(",")[1]))) {

			count = countSteam.findFirst().getAsInt();
			assertEquals(count, tracker.getArtistsSongCount(name));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@DisplayName("Get The Song Count Of Certain Artists Negative Test  ")
	@Test
	public void testGetArtistsSongCountByCSV_negative() {

		String invalidName = "negative stuff";
		try (IntStream countSteam = Files.lines(Paths.get(artistFile))
				.filter(line -> line.split(",")[0].equals(invalidName))
				.mapToInt(line -> Integer.parseInt(line.split(",")[1]))) {

			int count = (int) countSteam.sum();
			assumeTrue(count == 0, "Assumption has failed on invalid Artists");
			assertEquals(0, tracker.getArtistsSongCount(invalidName));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@DisplayName("Get The Most Productive Artists name Test")
	@Test
	public void testGetTheNameOfMostProductiveArtists() {

		try {

			String maxName = Files.lines(Paths.get(artistFile))
					.collect(maxBy
							  (comparingInt
								(line -> Integer.parseInt(line.split(",")[1]))
							  )
							)
					.map(line -> line.split(",")[0]).orElse("NO MAX");
			;

			assertEquals(maxName, tracker.getTheNameOfMostProductiveArtists());

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	@DisplayName("Get The Lowest Song Count Test")
	@Test
	public void testGgetTheLowestSongCount() {

		try {

			int minSong = Files.lines(Paths.get(artistFile))
					.mapToInt(line -> Integer.parseInt(line.split(",")[1]))
					.min().getAsInt();
			;

			assertEquals(minSong, tracker.getTheLowestSongCount());

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@DisplayName(" Get Random Artists Test ")
	@RepeatedTest(value = 10, name = RepeatedTest.LONG_DISPLAY_NAME)
	public void testGetRandomArtists(TestReporter testReporter) {
		
		Artist[] artists = tracker.getAllArtists();
		Artist randomGuy = tracker.findRandomArtists();

        testReporter.publishEntry(randomGuy.getName()
        						,String.valueOf(randomGuy.getSongCount() ) );
   
		assertNotNull("Null Object is returned ", randomGuy);

		boolean exists = Arrays.stream(artists).anyMatch(artist -> {
			return artist.getName().equals(randomGuy.getName())
					&& artist.getSongCount() == randomGuy.getSongCount();
		});

		assertTrue("Artists does not exist in all artists", exists);

	}

	@DisplayName(" Check if artists exist in all Artists Test ")
	@Test
	public void testCheckIfArtistsExists() {

		Artist[] artists = tracker.getAllArtists();
		Artist target = tracker.findRandomArtists();
		boolean nullObjectExists = tracker.checkIfArtistAlreadyExists(null);
		assertFalse(nullObjectExists);

		// assertNotNull("Null Object is returned ", target);
		assumeFalse(nullObjectExists);
		boolean exists = Arrays.stream(artists).anyMatch(artist -> {
			return artist.getName().equals(target.getName())
					&& artist.getSongCount() == target.getSongCount();
		});

		assertTrue("Artist does not exist in all artists", exists);

	}
    
	@AfterEach
	public void tearDown() {
		tracker = null;
		System.setOut(System.out);
		System.setErr(System.err);
	}

	@AfterAll
	public static void cleanUp() {
		System.out.println("End of The tES");
	}

}
