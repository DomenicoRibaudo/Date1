import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//        Formatta la data ottenuta in FULL, MEDIUM e SHORT
//        Stampa le varie versioni
public class Main {
    public static void main(String[] args) {

                // Creare un oggetto ZonedDateTime dalla stringa
                String dateString = "2002-03-01T13:00:00Z";
                ZonedDateTime zonedDateTime = OffsetDateTime.parse(dateString).toZonedDateTime();

                // Stampare le varie versioni formattate
                System.out.println("FULL: " + zonedDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
                System.out.println("MEDIUM: " + zonedDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
                System.out.println("SHORT: " + zonedDateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
            }
        }







