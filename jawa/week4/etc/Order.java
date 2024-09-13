public class Order{
  private OrderItem[] orderItems;
  private int totalOrderItem;

  public Order(){
    orderItems = new OrderItem[100];
    totalOrderItem = 0;
  }
  
  public void addOrderItem(OrderItem orderItem){
    orderItems[totalOrderItem] = orderItem;
    totalOrderItem++;
  }

  public int calculateTotal(){
    int total = 0;
    for (OrderItem item : orderItems) {
      if (item != null) {
          total += item.getTotalPrice();
      }
    }
    return total;
  }
}

 
