public class OrderItem{
  private int quantity;
  private MenuItem menuItem;

  public OrderItem(MenuItem menuItem, int quantity){
    this.menuItem = menuItem;
    this.quantity = quantity;
  }

  public int getTotalPrice(){
    return  getQuantity() * menuItem.getPrice();
  }
  public int getQuantity(){
    return this.quantity;
  }

}
