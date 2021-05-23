package md.tekwill.homework2105;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Friday13 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1900, 1, 1).with(DayOfWeek.FRIDAY);
        LocalDate finalDate = LocalDate.of(2000, 1, 1);
        while (date.isBefore(finalDate)) {
            if (date.getDayOfMonth() == 13) {
                System.out.println(date.format(DateTimeFormatter.ofPattern("yyyy MM dd")));
            }
            date = date.plusWeeks(1);
        }
    }
}
