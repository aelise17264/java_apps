import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberHelperTest {

    @Test
    void addNumbers() {
        NumberHelper numberHelper = new NumberHelper();
        assertEquals(1, numberHelper.addNumbers(0, 1));
        assertEquals(5, numberHelper.addNumbers(2, 3));
        assertEquals(9, numberHelper.addNumbers(4, 5));
    }
}