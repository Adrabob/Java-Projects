package Projects.Average_Stock_Price;

public class Stock {
    private int shares;
    private double price;
    private double total;
    public void buy(double p, int s){
        shares += s;
        price = p;
        total += p * s;
    }
     public void sell(double p, int s){
        shares -= s;
        price = p;
        total -= p * s;
    }
    public int getShare(){
        return shares;
    }
    public double getPrice(){
        return price;
    }
    public double getAveragePrice(){
        return total / getShare();
    } 
}
