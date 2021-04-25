package tasks.conditionaloperator;

    /**
    https://moodle.jrr.by/practice/141
    */

public class Stock {

    String companyName;
    int actualPrice;
    int minPrice;
    int maxPrice;

    public Stock(String companyName, int actualPrice) {
        this.companyName = companyName;
        this.actualPrice = actualPrice;
        this.minPrice = actualPrice;
        this.maxPrice = actualPrice;
    }

    public void updatePrice(int price) {
        actualPrice = price;
        if (price >= maxPrice){
            maxPrice = price;
        } else if (price <= minPrice){
            minPrice = price;
        }
    }

    public void printInformation() {
        System.out.println("Company: " + '"' + companyName + '"'
                + ", Actual Price = " + actualPrice
                + ", Min Price = " + minPrice
                + ", Max Price = " + maxPrice);
    }

    public static void main(String[] args) {
        Stock google = new Stock("Google", 234);
        google.printInformation();
        google.updatePrice(23);
        google.updatePrice(56);
        google.printInformation();
    }
}