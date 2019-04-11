package bookshop;

public class Book {

    private String title;
    private double fullPrice;

    public Book(String title, double fullPrice) {
        this.title = title;
        this.fullPrice = fullPrice;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return full price
     */
    public double getFullPrice() {
        return fullPrice;
    }

    /**
     * @param fullPrice full price
     */
    public void setFullPrice(double fullPrice) {
        this.fullPrice = fullPrice;
    }
}
