package software.daveturner.ocj11;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatterExample {

    public static void main(String[] args) {
        LocalDate d1 = LocalDate.of(1997,2,7);
        DateTimeFormatter dtf =
                DateTimeFormatter.ofPattern( "eeee d'th of' MMMM yyyy" );
        System.out.println(dtf.format (d1));
    }
}
