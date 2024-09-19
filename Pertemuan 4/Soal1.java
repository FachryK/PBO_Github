import com.polban.jtk.sales.*;

public class Soal1 {
        public static void main(String[] args) {
            Product product1 = new Product("Laptop", 10000000, 10);
            Sales sales1 = new Sales(product1);
    
            sales1.sellProduct(5);
            sales1.restockProduct(5);
            sales1.updateProductPrice(-12000000);
        }
}