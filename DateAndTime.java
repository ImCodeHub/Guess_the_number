import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.Locale;

public class DateAndTime {
    public static void main(String[] args) {
        /**to find today's date local date*/
        LocalDate date = LocalDate.now();
        System.out.println(date);

        /**to get the day of the date*/
        LocalDate freedom = LocalDate.of(1947,8,15);
        DayOfWeek freedomDay = freedom.getDayOfWeek();
        System.out.println("day of freedom: "+ freedomDay);


        Period period = Period.between(freedom,date);

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());


        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.println(zonedDateTime);

    }

}
