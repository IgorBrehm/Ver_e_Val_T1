package highScores;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class GameEntry_Test1 {

	@Test
	public void testGameEntryGetters() throws GameEntryException{
		String name = "Carlos";
		int score = 10;
		GameEntry entry1 = new GameEntry(name,score);
		assertEquals(name,entry1.getName());
		assertEquals(score,entry1.getScore());
		assertEquals("(Carlos, 10)",entry1.toString());
	}
}
