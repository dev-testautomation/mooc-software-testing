package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.CharArrayWriter;

public class CaesarShiftCipherTest {

    @ParameterizedTest(name = "message={0}, shift={1}, output={2}")
    @CsvSource({
            "abc, 1, bcd", "abc, 0, abc", "abc, 26, abc", "abc, 27, bcd",
            "xyz, 3, abc", "bcd, -1, abc",
            "a_bc, 1, invalid", "abc, 261, bcd"
    })
    public void CaesarTest(String input, Integer shift, String exp_output) {
        String output = new CaesarShiftCipher().CaesarShiftCipher(input, shift);
        Assertions.assertEquals(exp_output, output);
    }

}
