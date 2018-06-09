package may192018;

public interface Drinklable {

		default void drink() {
			System.out.println("this is 2nd"
					+ "way to drink ");
		}
}
