import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberHelperTest {

    @Test
    void addNumbers() {
        NumberHelper numberHelper = new NumberHelper();
        assertEquals(1, numberHelper.addNumbers(1, 0));
        assertEquals(2, numberHelper.addNumbers(1, 1));
        assertEquals(9, numberHelper.addNumbers(5, 4));
    }
}