/**
 * Created by markus on 13.03.17.
 */
public class Pizza {

    private static void pizzaTeig(int person) {
        System.out.println("PIZZA");
        System.out.print(500*person);
        System.out.println(" g Mehl");
        System.out.print(person);
        System.out.println(" Würfel Germ");
        System.out.print(250*person);
        System.out.println(" ml Wasser");
    }

    private static void pizzaMitKaese() {
        pizza(true);
    }

    private static void pizza(boolean kaese) {
        pizzaTeig(1);
        if (kaese) {
            System.out.println("100g Käse");
        }
    }

    public static void main(String[] args) {
        pizzaMitKaese();
        int i=0;
        while (i<5)
        {
            pizza(i%2 == 0);
            ++i;
        }
        pizzaTeig(5);
    }
}
