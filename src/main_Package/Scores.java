package main_Package;

/*
 * Todos os jogos desenvolvidos por uma determinada empresa de jogos de computador s�o
 * capazes de armazenar os 5 melhores scores.
 * O m�todo �add� da interface �Scores� deve inserir os scores em ordem. 
 * A partir do momento em que a lista estiver cheia sempre que um novo �melhor score�
 * tiver de ser inserido o menor score armazenado ter� de ser removido. 
 * Isso implica, tamb�m, que a partir do momento em que a lista estiver cheia 
 * apenas scores maiores que os j� armazenados poder�o ser armazenados.
 */

/** Interface of classes for storing high scores in an array in non-decreasing order.
* Format: [(<name>, <score>), (<name>, <score>) �]
* Example: [(John, 10), (Carol, 5), (Dan, 3)]
*/
public interface Scores {
/** Returns a string representation of the high scores list */
String toString();
/** Attempt to add a new score to the collection (if it is high enough) */
boolean add(GameEntry e);
/** Remove and return the high score at index i */
GameEntry remove(int i) throws IndexOutOfBoundsException;
/** Returns the capacity of the collection*/
int getCapacity();
/** Returns the number of scores currently stored on the collection */
int getNumElements();
}