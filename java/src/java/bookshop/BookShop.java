package bookshop;

public class BookShop {
    private final double DISCOUNT_EVERY_THREE_BOOKS = 20 / 100;
    private final Book[] books;

    public BookShop() {
        this.books = new Book[]{
                new Book("Harry Potter and the Half-Blood Prince", 16.94),
                new Book("Harry Potter and the Chamber of Secrets", 17.26),
                new Book("Harry Potter And The Sorcerer's Stone", 12.70),
                new Book("Harry Potter And The Goblet Of Fire", 18.28),
                new Book("Harry Potter and the Order of the Phoenix", 18.29)
        };
        this.orderTotal = 0.0;
        this.totalBooks = 0;
        this.receipt = "";
    }

    private String receipt;
    private double orderTotal;
    private int totalBooks;

    public void buy(String title) {
        double price = 0;
        receipt += "" + title;
        for (int i = 0; i < books.length; i++) {
            if (title.equals(this.books[i].getTitle())) {
                price = books[i].getFullPrice();
            }
        }
        String priceStr = String.format("%2.2f", price);
        receipt += String.format(": %s EUR\n", priceStr);
        orderTotal += price;
        totalBooks++;
        if (totalBooks > 3) {
            orderTotal = orderTotal - price + price * DISCOUNT_EVERY_THREE_BOOKS;
        }
    }

    private double getTotal() {
        return orderTotal;
    }

    public String getReceipt() {
        double total = getTotal();
        return String.format("%s\nTOTAL: %s EUR", receipt, total);
    }

}
