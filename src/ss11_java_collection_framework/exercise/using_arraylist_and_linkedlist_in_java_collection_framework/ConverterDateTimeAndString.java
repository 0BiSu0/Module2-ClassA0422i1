package ss11_java_collection_framework.exercise.using_arraylist_and_linkedlist_in_java_collection_framework;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ConverterDateTimeAndString {
    public static LocalDate converterStringToLocalDay(String date){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        return LocalDate.parse(date, dateTimeFormatter);
    }
    public static String converterLocalDatToString(LocalDate date){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        return date.format(dateTimeFormatter);
    }
}
