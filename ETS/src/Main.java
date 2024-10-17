import com.Delivery;
import com.PaymentService;
import com.Product;
import com.Status;
import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class Main {
    public static void main(String[] args) throws Exception {
        Gson gson = new Gson();
        Delivery[] delivery = gson.fromJson(new FileReader(JSON_FILE), Delivery[].class)
        City city = new City();
        PaymentService ps = new PaymentService();
        Product p = new Product();
        Status s = new Status();
    }
}
