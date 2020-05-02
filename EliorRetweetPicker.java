
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.IDs;
import twitter4j.Status;
import twitter4j.TwitterException;
import java.util.Random;

public class EliorRetweetPicker {
	
	public static void main (String[] args) throws NumberFormatException, TwitterException {
		RetweetPicker();
	}

	public static void RetweetPicker() throws NumberFormatException, TwitterException {
		 String statusID = "1254144338814095360";
		Twitter twit = TwitterFactory.getSingleton();
	    IDs stat = twit.getRetweeterIds(Long.parseLong(statusID), 75000, 0);
	
	    Random rng = new Random();
	    int pick = rng.nextInt(stat.getIDs().length-1);
	   
	    //System.out.println(twit.showUser(stat.getIDs()[pick]).getScreenName());
	    System.out.println(stat.getIDs().length);
	}
}