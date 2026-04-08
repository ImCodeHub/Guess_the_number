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

        //local time
        System.out.println(LocalTime.now());

        //Date formatter
        System.out.println("Today's date: "+date);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd / MM / yyyy");

        String formatedDate = date.format(dateTimeFormatter);
        System.out.println("Date after format: "+formatedDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd - MM - yyyy | hh : mm : ss");
        String format = localDateTime.format(dateTimeFormatter1);
        System.out.println("formated date and time: "+format);

        System.out.println(freedom);

        String dinank = "20--/--04----2027";

        DateTimeFormatter starPattern = DateTimeFormatter.ofPattern("dd--/--MM----yyyy");

        LocalDate parse = LocalDate.parse(dinank, starPattern);

        System.out.println("after parse: "+parse);

        Period between = Period.between(freedom, parse);
        System.out.println(between.getYears());

        LocalTime time1 = LocalTime.of(11, 20);
        LocalTime time2 = LocalTime.of(17, 25);

        Duration duration = Duration.between(time1, time2);

        System.out.println(duration.toHours() +" : "+duration.toMinutesPart());
        System.out.println(duration.toMinutes());
    }

}
