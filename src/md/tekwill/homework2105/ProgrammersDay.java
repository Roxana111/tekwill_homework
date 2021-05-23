package md.tekwill.homework2105;

import java.time.LocalDate;

public class ProgrammersDay {
    public static void main(String[] args) {
        LocalDate programmingDay = LocalDate.now().withDayOfYear(256);
        System.out.println("In the current year, the programmer's day is on: " + programmingDay);
    }
}
