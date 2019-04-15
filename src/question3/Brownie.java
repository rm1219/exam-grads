package question3;
import java.util.*;

public class Brownie implements BakedGoods {

    public Brownie(){

    }

    public int getPrice(){
        return 5;
    }
    public String getDescription(){
        return "A chocolate brownie (commonly referred to as simply brownie) is a square, baked, chocolate dessert. Brownies come in a variety of forms and may be either fudgy or cakey, depending on their density. They may include nuts, frosting, cream cheese, chocolate chips, or other ingredients";
    }
    public String getSellByDate(){
        return new Date().toString();
    }
}