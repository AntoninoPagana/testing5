import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime nuovaData = data.plusYears(1).minusMonths(1).plusDays(7);
        System.out.println(nuovaData);
    }
}
