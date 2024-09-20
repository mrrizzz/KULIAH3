public class TesOrder{
  public static void main(String[] args){
    MenuItem burger = new MenuItem("Burger", 50000);
    MenuItem fries = new MenuItem("Fries", 20000);
    MenuItem drink = new MenuItem("drink", 10000);

    OrderItem orderItem1 = new OrderItem(burger, 2);
    OrderItem orderItem2 = new OrderItem(fries, 3);
    OrderItem orderItem3 = new OrderItem(drink, 2);

    Order order = new Order();
    order.addOrderItem(orderItem1);
    order.addOrderItem(orderItem3);
    order.addOrderItem(orderItem2);

    System.out.println("Total Pesanan : " + order.calculateTotal());
      
  }
}
