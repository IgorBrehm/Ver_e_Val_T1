package highScores;

/*
 * Todos os jogos desenvolvidos por uma determinada empresa de jogos de computador são
 * capazes de armazenar os 5 melhores scores.
 * O método “add” da interface “Scores” deve inserir os scores em ordem. 
 * A partir do momento em que a lista estiver cheia sempre que um novo “melhor score”
 * tiver de ser inserido o menor score armazenado terá de ser removido. 
 * Isso implica, também, que a partir do momento em que a lista estiver cheia 
 * apenas scores maiores que os já armazenados poderão ser armazenados.
 */

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameEntry_Test {

	@Test
	void test() {
		fail("Not yet implemented");
	}

}

/*
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPayment {

    @Test
    void testPayment() throws PaymentException{

            assertEquals("0", Payment.signaturePayment("regular", 0.01));
            assertEquals("0", Payment.signaturePayment("estudante/aposentado", 0.01));
            assertEquals("0", Payment.signaturePayment("VIP", 0.01));
            assertEquals("0", Payment.signaturePayment("regular", 99.999));
            assertEquals("0", Payment.signaturePayment("estudante/aposentado", 99.999));
            assertEquals("0", Payment.signaturePayment("VIP", 99.999));
            assertEquals("1", Payment.signaturePayment("regular", 100.000));
            assertEquals("1", Payment.signaturePayment("estudante/aposentado", 0.00));
            assertEquals("1", Payment.signaturePayment("VIP", 100.000));
            assertEquals("2", Payment.signaturePayment("hello", 99.999));
            assertEquals("2", Payment.signaturePayment("olleh", 0.01));
    }
}
*/
