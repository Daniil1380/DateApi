import java.time.*;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(1999, Calendar.DECEMBER, 20);
        Date dateSecond = new Date(1999, Calendar.DECEMBER, 21);

        System.out.println(dateSecond.after(date));
        System.out.println(date.getHours());

        System.out.println(date);
        System.out.println("Hello world!");

        LocalDate localDate = LocalDate.now();
        LocalDate localDateSecond = LocalDate.of(2012, 12, 21);
        LocalDate localDateThird = LocalDate.ofEpochDay(1);
        LocalDate localDateYear = LocalDate.ofYearDay(2012, 123);
        LocalDate localDateParse = LocalDate.parse("1998-01-01");
        System.out.println(localDate);
        System.out.println(localDateSecond);
        System.out.println(localDateThird);
        System.out.println(localDateYear);
        System.out.println(localDateParse);

        System.out.println(localDateParse.isLeapYear());
        System.out.println(localDateParse.getDayOfWeek());

        localDateParse = localDateParse.plusWeeks(2);
        System.out.println(localDateParse);
        localDateParse = localDateParse.minusYears(2);
        System.out.println(localDateParse);

        LocalTime localTime = LocalTime.now();
        LocalTime localTimeOf = LocalTime.of(2, 3, 1, 4);
        LocalTime localTimeSeconds = LocalTime.ofSecondOfDay(12324);
        System.out.println(localTime);
        System.out.println(localTimeOf);
        System.out.println(localTimeSeconds);

        localTimeOf = localTimeOf.minusMinutes(2);
        System.out.println(localTimeOf);

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(2013, 2, 3, 4, 2, 1);
        LocalDateTime localDateTime2 = LocalDateTime.of(localDate, localTime);

        localDateTime1 = localDateTime1.withYear(2023);

        System.out.println(localDateTime1);

        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(2009, 6, 2, 4, 2, 2,2, ZoneId.of("Europe/Berlin"));
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(2019, 6, 2, 4, 2, 2,2, ZoneId.of("Europe/Berlin"));

        ZonedDateTime zonedDateTime3 = zonedDateTime.withZoneSameInstant(ZoneId.of("Europe/Berlin"));
        ZonedDateTime zonedDateTime4 = zonedDateTime.withZoneSameLocal(ZoneId.of("Europe/Berlin"));

        System.out.println("-------------");

        System.out.println(zonedDateTime);

        System.out.println(zonedDateTime3);
        System.out.println(zonedDateTime4);

        System.out.println("-------------");

        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime2);

        Instant instant = Instant.now(); //хранит в себе числа, секунды и наносекунды с 1 января 1970
        //instant - всегда рассчитывает значение в UTC (время по гринвичу)

        System.out.println(instant);

        LocalDate localDate1 = localDateTime1.toLocalDate();
        ZonedDateTime zonedDateTime5 = instant.atZone(ZoneId.of("Europe/Berlin"));
        Instant instant1 = zonedDateTime5.toInstant();
    }
}