package herenciaPublicacion;

public class Book extends Publication {

    private int pages;

    public Book() {
        super();
        pages = 0;
    }

    public Book(String title, float price, int pages) {
        super(title, price);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public void show() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("Pages: " + pages);
    }

    @Override
    public String toString() {
        return String.format("Book[Publication[title=%s, price=%s], pages=%s]", super.getTitle(), super.getPrice(), pages);
    }
}