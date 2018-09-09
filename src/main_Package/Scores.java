package main_Package;

/** Interface of classes for storing high scores in an array in non-decreasing order.
* Format: [(<name>, <score>), (<name>, <score>) …]
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