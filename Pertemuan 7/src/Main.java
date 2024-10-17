import com.Cat;
import com.Pea;

public class Main {
    public static void main(String[] args) throws Exception {
        Cat cat = new Cat("Cat");
        Pea pea = new Pea("Pea");
        cat.breathe();
        cat.makeSound();
        cat.move();
        pea.breathe();
        pea.canProduce();
    }
}