import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReversePolishNotationCalculatorTest {

    private final ReversePolishNotationCalculator reversePolishNotationCalculator = new ReversePolishNotationCalculator();

    @Test
    public void shouldReturn10ForPlus() {
        String notation = "3 7 +";
        int result = reversePolishNotationCalculator.calculatePolishNotation(notation);
        assertEquals(10, result);
    }

    @Test
    public void shouldReturn17ForMinus() {
        String notation = "27 10 -";
        int result = reversePolishNotationCalculator.calculatePolishNotation(notation);
        assertEquals(17, result);
    }

    @Test
    public void shouldReturn30ForMultiply() {
        String notation = "5 6 *";
        int result = reversePolishNotationCalculator.calculatePolishNotation(notation);
        assertEquals(30, result);
    }

    @Test
    public void shouldReturnMinus43ForNegativeNumbers() {
        String notation = "-23 -20 +";
        int result = reversePolishNotationCalculator.calculatePolishNotation(notation);
        assertEquals(-43, result);
    }

    @Test
    public void shouldReturn7ForSpaces() {
        String notation = "    100    -93    +   ";
        int result = reversePolishNotationCalculator.calculatePolishNotation(notation);
        assertEquals(7, result);
    }

}