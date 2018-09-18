package highScores;

import org.junit.Test;

public class Scores_Test1 {

	@Test(expected = IndexOutOfBoundsException.class)
	   public void testRemove() throws Exception{	
		Scores scores = new ScoresBuggedImpl();
		scores.add(new GameEntry("Pedro",10));
		scores.remove(-5);
	   }
	@Test(expected = IndexOutOfBoundsException.class)
	   public void testRemove2() throws Exception{	
		Scores scores = new ScoresBuggedImpl();
		scores.add(new GameEntry("Pedro",10));
		scores.remove(10);
	   }

}