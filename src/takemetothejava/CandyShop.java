package takemetothejava;
import java.util.ArrayList;

public class CandyShop extends Sweets {
    ArrayList<Sweets> sweetsList;
    float sugarInShop;
    float incomeInShop;

    public CandyShop(float sugar) {
        this.sugarInShop = sugar;
        sweetsList = new ArrayList<Sweets>();
    }
    public void createSweets(Sweets SweetType) {
        sugarInShop -= SweetType.sugar;
        sweetsList.add(SweetType);
    }
    public float raise(int percent, Sweets sweetType) {
        sweetType.price += (price*percent/100);
        return sweetType.price;
    }

    public float sell(int quateToSell, Sweets sweetType) {
        incomeInShop += quateToSell * sweetType.price;
        sweetsList.remove(0);
        return incomeInShop;
    }
    public void buySugar(float sugarToBuy) {
        float sugarPricePerGram = 100 / 1000;
        sugarInShop += sugarToBuy;
        incomeInShop -= sugarToBuy * sugarPricePerGram;
    }
}
