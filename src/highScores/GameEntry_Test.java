package highScores;

import org.junit.Test;

public class GameEntry_Test {
	
	@Test(expected = GameEntryException.class)
	   public void testGameEntryConstructor() throws GameEntryException{	
	      GameEntry entry2 = new GameEntry("Pedro",-10);  
	   }
	@Test(expected = GameEntryException.class)
	   public void testGameEntryConstructor2() throws GameEntryException{	
	      GameEntry entry3 = new GameEntry("",20);  
	   }
}

