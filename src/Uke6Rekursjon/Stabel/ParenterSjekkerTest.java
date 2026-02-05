package Uke6Rekursjon.Stabel;


import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;




public class ParenterSjekkerTest {

    @Test
    public void TestSjekker() {
        String s = "[)";
        ParentesSjekker parenterSjekker = new ParentesSjekker();
        boolean test = parenterSjekker.sjekkParanteser(s);
        assertFalse(test);

        String s1 = "{ ( [ ] ) }";
        boolean test1 = parenterSjekker.sjekkParanteser(s1);
        assertTrue(test1);

        String javaprogram = """
            class HelloWorld {
            public static void main(String[] args) {
            System.out.println("Hello World!");
            }
            }
            """;
        boolean test2 = parenterSjekker.sjekkParanteser(javaprogram);
        assertTrue(test2);

    }

}
