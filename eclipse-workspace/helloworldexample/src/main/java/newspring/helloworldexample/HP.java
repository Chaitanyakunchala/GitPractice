package newspring.helloworldexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hp")
public class HP implements laptop1 {

    @Autowired
    private Price price;

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public void disp() {
        System.out.println("I am from HP and my price is " + price);
    }

}
