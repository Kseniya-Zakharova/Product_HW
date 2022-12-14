import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {

    @Test
    public  void testSearchWhenFewProductsFinded() {
        Repository repo = new Repository();
        ProductManager manager = new ProductManager(repo);
        String name;
        Book book1 = new Book(1,  "The snow queen", 500, "Andersen");
        Book book2 = new Book(2,  "Tom Sawyer", 400,  "Tven");
        Smartphone phone1 = new Smartphone(  3,  "Samsung 8",  20000,  "Samsung");

        manager.add(book1);
        manager.add(book2);
        manager.add(phone1);

        Product[] actual = manager.searchBy( "Tom");
        Product[] expected = { book2 };

        Assertions.assertArrayEquals(expected, actual);
    }
}