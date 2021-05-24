package md.tekwill.homework2105;

import java.time.LocalTime;
import java.util.Date;
import java.time.Month;
import java.time.Period;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysAlive {
    public static void main(String[] args) {
        int countDaysAlive = 0;
        LocalDate birthday = LocalDate.of(2003, Month.DECEMBER, 11);
        LocalDate today = LocalDate.now();

        while (!birthday.equals(today)) {
            birthday = birthday.plusDays(1);
            countDaysAlive++;
        }
        //System.out.println(birthday.until(today, ChronoUnit.DAYS));// another method
        //Period days = Period.between(birthday, today);
        //System.out.println(days.getYears()*365 + days.getMonths()*30 + days.getDays());
        System.out.println("Days alive: " + countDaysAlive);

    }
}
