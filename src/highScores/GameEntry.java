
package highScores;

public class GameEntry {
	protected String name; // name of the person earning this score

	protected int score; // the score value

	/** Constructor to create a game entry */
	public GameEntry(String n, int s) {
		name = n;
		s = score;
	}

	/** Retrieves the name field */
	public String getName() {
		return name;
	}

	/** Retrieves the score field */
	public int getScore() {
		return score;
	}

	/** Returns a string representation of this entry */
	public String toString() {
		return "(" + name + ", " + score + ")";
	}
}

/*
public class Payment {
    public static String signaturePayment(String status, double value) throws PaymentException {
            String code = "";

            if(!(status.equals("regular") || status.equals("estudante/aposentado") || status.equals("VIP"))) {
                code = "2";
            }

            else if(value > 99.999 || value < 0.01) {
                code = "1";
            }

            else {
                if (status.equals("regular") && (0.01 <= value && value <= 99.999)) {
                    code = "0";
                } else if (status.equals("estudante/aposentado") && (0.01 <= value && value <= 99.999)) {
                    code = "0";
                } else if (status.equals("VIP") && (0.01 <= value && value <= 99.999)) {
                    code = "0";
                } else {
                    throw new PaymentException();
                }
            }
            return code;
    }
}
 */
*/