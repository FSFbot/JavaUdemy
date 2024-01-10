package InharanceExercise;

public class ImportedProduct extends Produto {
    private double customFee;

    public ImportedProduct(String name, Double price,double customFee) {
        super(name, price);
        this.customFee = customFee;
    }
    public Double getTotalPrice(){
        return super.getPrice() + customFee;
    }
    @Override
    public String priceTag(){
        return super.getName() + " $ " String.format("%.2f". getTotalPrice()+ "Customs fee: $ "+ String.format("%.2f",customFee+")"));

    }
}
