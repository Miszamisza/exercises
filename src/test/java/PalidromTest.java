
import org.junit.Before;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;


class PalidromTest {

    private String word = "kajak";
    private String word4 = "Kajak ajak";
    private String word1 = "mama";
    private String word2 = "TaTa";
    private String word3 = "Tata jest";


    private Palidrom palidrom = new Palidrom();

    @Test
    void isPalidrom()  {

        assertTrue(palidrom.isPalidrome(word4, 0, word4.replace(" ", "").length()-1));
        assertTrue(palidrom.isPalidrome(word, 0, word.length()-1));

    }

    @Test
    void isPalidrome() {
        assertFalse( palidrom.isPalidrome(word1, 0, word1.length()-1));
        assertFalse( palidrom.isPalidrome(word2, 0, word2.length()-1));
        assertFalse( palidrom.isPalidrome(word3, 0, word3.replace(" ", "").length()-1));
    }
}
