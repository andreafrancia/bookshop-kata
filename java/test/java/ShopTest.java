import bookshop.BookShop;
import org.junit.Test;

public class ShopTest {
    @Test
    public void something() {
        BookShop shop = new BookShop();
        shop.buy("Harry Potter and the Half-Blood Prince");
        shop.buy("Harry Potter And The Sorcerer's Stone");
        shop.buy("Harry Potter and the Order of the Phoenix");

        System.out.println(shop.getReceipt());
    }
}
