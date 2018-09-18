package highScores;

/*
 * Todos os jogos desenvolvidos por uma determinada empresa de jogos de computador s�o
 * capazes de armazenar os 5 melhores scores.
 * O m�todo �add� da interface �Scores� deve inserir os scores em ordem. 
 * A partir do momento em que a lista estiver cheia sempre que um novo �melhor score�
 * tiver de ser inserido o menor score armazenado ter� de ser removido. 
 * Isso implica, tamb�m, que a partir do momento em que a lista estiver cheia 
 * apenas scores maiores que os j� armazenados poder�o ser armazenados.
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Scores_Test {

	@Test
	public void testScoresBuggedImpl() throws GameEntryException{
		Scores scores = new ScoresBuggedImpl();
		GameEntry entry = new GameEntry("Pedro",10);
		assertEquals(true,scores.add(entry));
		assertEquals(1,scores.getNumElements());
		assertEquals(5,scores.getCapacity());
		assertEquals(true,scores.add(new GameEntry("Carlos",15)));
		assertEquals("[(Carlos, 15), (Pedro, 10)]",scores.toString()); //testando tamb�m se o add est� ordenando
		assertEquals(entry,scores.remove(1)); 
		assertEquals(true,scores.add(new GameEntry("Beatriz",20)));
		assertEquals(true,scores.add(new GameEntry("Paulo",12)));
		assertEquals(true,scores.add(new GameEntry("Joao",16)));
		assertEquals(true,scores.add(new GameEntry("Jair",17)));
		assertEquals(false,scores.add(new GameEntry("Bruno",5))); //testando array cheio, valor inv�lido
		assertEquals(true,scores.add(new GameEntry("Ricardo",50))); //testando array cheio, valor v�lido
		assertEquals("[(Ricardo, 50), (Beatriz, 20), (Jair, 17), (Joao, 16), (Carlos, 15)]",scores.toString());
	}
	
}
