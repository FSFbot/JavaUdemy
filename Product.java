public class Product {

    String name;
    double price;
    int quantity;

    double totalValueStock(){
        return price * quantity;
    }

    void addToStock(int quantity){
        this.quantity += quantity;
    }
    void removeFromStock(int quantity){
        this.quantity -= quantity;
    }

    @Override
    public String toString(){
        return name+ ", $ "+ String.format("%.2f",price) + " , "+ quantity +
                "units, Total: $"+ String.format("%.2f", totalValueStock());
    }
}
