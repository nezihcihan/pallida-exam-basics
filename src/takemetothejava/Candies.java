package takemetothejava;

public class Candies {
    int price;
    float sugar;


    public Candies () {
        price = 20;
        sugar = 10;
    }

    public int raisePriceCandies(int percent) {
        price += (price*percent/100);
        return price;
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
}
