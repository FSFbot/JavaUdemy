package enums;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Order {
     private Date moment;
     private OrderStatus status;
     private List<OrderItem> items = new ArrayList<>();
     private Client client;

     public Order(Date moment, OrderStatus status, Client client) {
          this.moment = moment;
          this.status = status;
          this.client = client;
     }
     public void addItem(OrderItem item) {
        items.add(item);
    }
    public void removeItem(OrderItem item){
          items.remove(item);
    }
    public double total() {
          double total = 0.0;
          for (OrderItem item: items){
               total += item.subTotal();
          }
          return total;
    }
    @Override
    public String toString() {
         StringBuilder sb = new StringBuilder();
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
         sb.append("Order moment: ").append(sdf.format(moment)).append("\n");
         sb.append("Order status: ").append(status).append("\n");
         sb.append("Client: ").append(client).append("\n");
         sb.append("Order items:\n");
         for (OrderItem item : items) {
              sb.append(item).append("\n");
         }
         sb.append("Total price: $").append(String.format("%.2f", total()));
         return sb.toString();
     }
}

