package question3;
import java.util.*;

public class Cookie  implements BakedGoods {

    public Cookie(){
    }

    public int getPrice(){
        return 2;
    }
    public String getDescription(){
        return "A cookie is a baked or cooked food that is small, flat and sweet. It usually contains flour, sugar and some type of oil or fat. It may include other ingredients such as raisins, oats, chocolate chips, nuts, etc.";
    }
    public String getSellByDate(){
        return new Date().toString();
    }
}