
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.IDs;
import twitter4j.Status;
import twitter4j.TwitterException;
import java.util.Random;

public class EliorRetweetPicker {

	public static void main(String[] args) throws NumberFormatException, TwitterException {
		RetweetPicker();
	}

	

	public static void RetweetPicker() {
		String statusID = "1255704634821234689";
		Twitter twit = TwitterFactory.getSingleton();
		
		
		try {

			IDs stat = twit.getRetweeterIds(Long.parseLong(statusID), 75000, 0);

			Random rng = new Random();
			int pick = rng.nextInt(stat.getIDs().length -1);

			System.out.println(twit.showUser(stat.getIDs()[pick]).getScreenName());
			System.out.println(stat.getIDs().length);

		} catch (TwitterException e) {

			e.printStackTrace();
		}
	}
}