import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    Main testing = new Main();
    @Test
    void controlloData() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime result = testing.formattaData(data);
        OffsetDateTime expected = OffsetDateTime.parse("2024-02-08T13:00Z");
        assertEquals(expected, result);
    }
}

