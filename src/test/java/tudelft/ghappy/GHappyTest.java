package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {

    private GHappy GH;
    @BeforeEach
    public void initialize() {
        GH = new GHappy();
    }
    @Test
    public void singleG() {
        boolean result = GH.gHappy("xxxgxxx");
        Assertions.assertEquals(false, result);
    }

    @ParameterizedTest(name = "input={0}, happy={1}")
    @CsvSource({
            "xxxgxxx, false", "xxggxx, true", "xxggyygxx, false",
            "xxgggxx, true", "gxxxx, false", "xxxxg, false",
            "xxxgg, true", "g, false", "gg, true"})
    public void paramG(String str, boolean expres) {
        boolean result = GH.gHappy(str);
        Assertions.assertEquals(expres, result);
    }
}
