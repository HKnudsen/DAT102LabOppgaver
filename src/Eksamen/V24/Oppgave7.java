package Eksamen.V24;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Stack;

public class Oppgave7 {
    static void main() {
        System.out.println(desimalTilBinaer(10));
    }
    static public String desimalTilBinaer(int tallet) {
        if(tallet == 0) {
            return "0";
        }
        Stack<Integer> stack = new Stack<>();
        while(tallet > 0) {
            stack.push(tallet % 2);
            tallet = tallet / 2;
        }
        String binaerString = "";
        while(!stack.isEmpty()){
            binaerString += stack.pop();
        }
        return binaerString;
    }

    @Test
    public void testdesimalTilBinear() {
        assertEquals("0", desimalTilBinaer(0));
        assertEquals("1", desimalTilBinaer(1));
        assertEquals("10", desimalTilBinaer(2));
        assertEquals("11", desimalTilBinaer(3));
        assertEquals("1010", desimalTilBinaer(10));
    }
}
