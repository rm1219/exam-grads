package question3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cookie cookie = new Cookie();
        CinnamonRoll cinnamonRoll = new CinnamonRoll();
        Brownie brownie = new Brownie();

        ArrayList<BakedGoods> bakedGoodsList = new ArrayList<BakedGoods>();
        bakedGoodsList.add(cookie);
        bakedGoodsList.add(cinnamonRoll);
        bakedGoodsList.add(brownie);

        for (BakedGoods item : bakedGoodsList) {
            System.out.println(item.getClass().getName() + ":" + "\n" +
                               "Price: $" + item.getPrice() + "\n" +
                               "Descroption: " + item.getDescription() + "\n" +
                               "Sell By Date: " + item.getSellByDate());
        }
    }
}