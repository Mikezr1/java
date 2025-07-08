package Lessen.les5H4StringsAndArrays.Date;

import java.time.LocalDate;
import java.time.Month;

public class dates {
    public static void main(String[] args) {
        LocalDate birth = LocalDate.of(1993,Month.APRIL,23);
        System.out.println(birth);

        LocalDate today = LocalDate.now();
        System.out.println(today);

//        niet handig, werkt niet als je de volgorde anders schrijf of zonder spaties typt dan werkt het al niet
        LocalDate date = LocalDate.parse("2020-01-10");
        System.out.println(date);

    }
}
