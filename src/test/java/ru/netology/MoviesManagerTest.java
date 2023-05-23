package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {


    @Test
    public void test() {
        MoviesManager manager = new MoviesManager();

        manager.addMovie("Номер один");
        manager.addMovie("Тролли Мировой тур");
        manager.addMovie("Человек-неведимка");
        manager.addMovie("Джентельмены");
        manager.addMovie("Отель Белград");
        manager.addMovie("Вперед");
        manager.addMovie("Бладшот");

        String[] expected = {"Номер один","Тролли Мировой тур","Человек-неведимка","Джентельмены","Отель Белград","Вперед","Бладшот"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testFindLast() {
        MoviesManager manager = new MoviesManager();
        manager.addMovie("Номер один");
        manager.addMovie("Тролли Мировой тур");
        manager.addMovie("Человек-невидимка");
        manager.addMovie("Джентельмены");
        manager.addMovie("Отель Белград");
        manager.addMovie("Вперед");
        manager.addMovie("Бладшот");

        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены","Человек-невидимка"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
