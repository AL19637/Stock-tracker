package MAGAZINE;
public class Magazine {
    private String title;
    private String month;
    private double price;

    // Constructor
    public Magazine(String title, String month, double price) {
        this.title = title;
        this.month = month;
        this.price = price;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getMonth() {
        return month;
    }

    public double getPrice() {
        return price;
    }

    // Setters
    public void setTitle(String title)  {
        this.title = title;
    }

    public void setMonth(String month)  {
        this.month = month;
    }

    public void setPrice(double price)  {
        this.price = price;
    }

    // toString method
    public String toString() {
        return "Title: " + title +
        		",  Month published: " + month + 
        		",  Price: $" + price;
    }
}
