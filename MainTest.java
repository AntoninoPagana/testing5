import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    void controlloData() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String actual = data.plusYears(1).minusMonths(1).plusDays(7).toString();
        String expected = "2024-02-08T13:00Z";
        assertEquals(expected, actual);
    }
}

