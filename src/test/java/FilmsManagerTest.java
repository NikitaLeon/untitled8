import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {
    @Test
    public void findAddFilms() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель 'Белград'");

        String[] expected = {"Бладшот", "Вперёд", "Отель 'Белград'"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void lastFilms() {
        FilmsManager manager = new FilmsManager();

        manager.addFilm("Бладшот");
        manager.addFilm("Вперёд");
        manager.addFilm("Отель 'Белград'");

        String[] expected = {"Отель 'Белград'", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
