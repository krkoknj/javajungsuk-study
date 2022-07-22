import java.util.ArrayList;

public class Ex12_1 {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<Tv> tvlist = new ArrayList<Tv>();

        productList.add(new Tv());
        productList.add(new Audio());

        tvlist.add(new Tv());
        tvlist.add(new Tv());

        printAll(productList);
    }

    private static void printAll(ArrayList<Product> list) {
        for (Product p : list)
            System.out.println("p = " + p.print());
    }
}

class Product{
    public String print() {
        return "product";
    }
}
class Tv extends Product{
    public String print() {
        return "Tv";
    }
}
class Audio extends Product{
    public String print() {
        return "Audio";
    }
}

