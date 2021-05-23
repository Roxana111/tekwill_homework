package md.tekwill.homework2105;

import java.time.Month;
import java.time.Period;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysAlive {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(2003, Month.DECEMBER, 11);
        LocalDate today = LocalDate.now();
        System.out.println(birthday.until(today, ChronoUnit.DAYS));
        //Period days = Period.between(birthday, today);
        //System.out.println(days.getYears()*365 + days.getMonths()*30 + days.getDays());
        // System.out.println("Days alive: " + days);

    }
}
