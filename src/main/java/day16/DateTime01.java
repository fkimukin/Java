package day16;

import java.sql.Date;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        LocalDate currentDateInJapan= LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateInJapan);


        LocalDate cd1= LocalDate.now();
        LocalDate cd1Next= cd1.plusDays(120);
        System.out.println(cd1Next);
LocalDate cd1Past= cd1.minusYears(3).minusMonths(2).minusDays(5);
        System.out.println(cd1Past);

        LocalTime ct1= LocalTime.now();
        int hour= ct1.getHour();
        System.out.println(hour);


        DateTimeFormatter dateFormat=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate= dateFormat.format(cd1);
        System.out.println(formattedDate);

        java.util.Date date=new java.util.Date();
        System.out.println(date);


LocalDate dobTom= LocalDate.of(1923, Month.OCTOBER,5).plusYears(45).plusMonths(8).plusDays(5);
        System.out.println(dobTom);





    }
}
