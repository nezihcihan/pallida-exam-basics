package takemetothejava;

public class Lollipops {
    int price;
    float sugar;


    public Lollipops () {
        price = 10;
        sugar = 5;
    }

    public int getPrice() {
        return price;
    }

    public float getSugar() {
        return sugar;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSugar(float sugar) {
        this.sugar = sugar;
    }
    public int raisePriceCandies(int percent) {
        price += (price*percent/100);
        return price;
    }
}
