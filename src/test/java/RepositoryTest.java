import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {

    @Test
    public void testRemoveCorrectId() {
        Repository repo = new Repository();
        Book book1 = new Book(1, "The snow queen",  500, "Andersen");
        Book book2 = new Book(2,  "Tom Sawyer", 400,  "Tven");
        Smartphone phone1 = new Smartphone( 3,  "Samsung 8",  20000,  "Samsung");
        repo.add(book1);
        repo.add(book2);
        repo.add(phone1);

        repo.remove( 2);

        Product[] actual = repo.findAll();
        Product[] expected = { book1, phone1 };

        Assertions.assertArrayEquals(expected, actual);
    }


}