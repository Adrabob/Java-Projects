package Projects.Average_Stock_Price;

public class Main {
    public static void main(String[] args) {
        Stock aCompany =new Stock();
        aCompany.buy(31.6, 1000);
        aCompany.buy(34.7, 2500);
        aCompany.sell(45.8, 3000);
        System.out.println(aCompany.getShare());
        System.out.println(aCompany.getPrice());
        System.out.println(aCompany.getAveragePrice());

    }
}
