package breakout;

import java.io.BufferedWriter;

public class Ranking {
	protected String ranking = "../resources/ranking.txt";

	
	static void addPoint(){
		 BufferedWriter writer = null;
	     try {
	    	 //TODO add ranking file location and add time and points
	     } catch (Exception e) {
	         e.printStackTrace();
	     } finally {
	         try {
	             writer.close();
	         } catch (Exception e) {
	         }
	     }
	}
}
