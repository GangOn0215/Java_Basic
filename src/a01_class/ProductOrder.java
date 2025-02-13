package a01_class;

/**
 *
 */
public class ProductOrder {
   String productName;
   int price;
   int quantity;

   ProductOrder(String name, int price, int quantity) {
      this.productName = name;
      this.price = price;
      this.quantity = quantity;
   }
}
