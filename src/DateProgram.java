import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите любую дату в формате дд.мм.гггг:");
        String date = scanner.nextLine();

        System.out.println("Введите формат даты:");
        String format = scanner.nextLine();

        //15.11.2023

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        LocalDate localDate = LocalDate.parse(date, formatter);

        if (localDate.isBefore(LocalDate.now())) {
            System.out.println("Вы выбрали дату в прошлом");
        }
        else {
            System.out.println("Вы выбрали дату в будущем");
        }


    }
}
