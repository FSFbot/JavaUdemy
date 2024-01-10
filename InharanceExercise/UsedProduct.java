package InharanceExercise;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Produto{
    private Date manufactureDate;

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public UsedProduct (String name, Double price, Date manufactureDate){
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return super.getName()+ " (used) $ " + String.format("%.2f", super.getPrice()) + " (Manufacture date: " + sdf.format(manufactureDate) + ")";
    }


}
