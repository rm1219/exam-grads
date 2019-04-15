package question3;
import java.util.*;

public class CinnamonRoll  implements BakedGoods {

    public CinnamonRoll(){

    }

    public int getPrice(){
        return 4;
    }
    public String getDescription(){
        return "A cinnamon roll consists of a rolled sheet of yeast-leavened dough onto which a cinnamon and sugar mixture (and raisins or other ingredients in some cases) is sprinkled over a thin coat of butter. The dough is then rolled, cut into individual portions, and baked or deep fried";
    }
    public String getSellByDate(){
        return new Date().toString();
    }

}