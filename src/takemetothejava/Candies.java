package takemetothejava;

public class Candies extends Sweets {

    public Candies () {
        this.price = 20;
        this.sugar = 10;
    }

    public float getPrice() {
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
