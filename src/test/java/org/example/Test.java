package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {

    @ParameterizedTest(name = "Sekuntimäärä {0} on muotoiltu aika {1}")
    @CsvSource({
            "0, 0:00:00",
            "1, 0:00:01",
            "60, 0:01:00",
            "3600, 1:00:00",
            "3661, 1:01:01",
            "86399, 23:59:59",
            "86400, -1",
            "-1, -1"
    })
    public void testSecToTime(int seconds, String expectedTime) {
        assertEquals(expectedTime, TimeUtils.secToTime(seconds),
                "Sekuntimäärän " + seconds + " muuntaminen epäonnistui.");
    }

}
