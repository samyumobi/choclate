package beer_advisr.hfad.com.choclate;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;
//color=flavour brands=varieties
/**
 * Created by mantrisam on 14-Aug-16.
 */
public class ChocExpert {
    List<String> getVarieties(String flavour) {
        List<String> varieties = new ArrayList<String>();
        if (flavour.equals("White Choclate")) {
            varieties.add("Nestle MOO White Choclate Strawberry");
            varieties.add("Nestle MOO White Choclate Vanilla");
            varieties.add("Luvit White Perk");
            varieties.add("Amul white bar choclate");
        }
        if (flavour.equals("Milk Choclate")) {
            varieties.add("Cadbury Dairy Milk");
            varieties.add("Nestle Kitkat");
            varieties.add("Luvit Choclate bars");
            varieties.add("5 star Caramel choclate");
        }
        if (flavour.equals("Dark Choclate")) {
            varieties.add("Bournville");
            varieties.add("Cadbury Coco dark");
            varieties.add("Mars");
            varieties.add("Nestle dark bars");
        }
        if (flavour.equals("Stuffed Choclates")) {
            varieties.add("Bonkers Fruity chews");
            varieties.add("Bounty Coconut");
            varieties.add("Cadbury Fruit and nut ");
            varieties.add("5-star fruit and nut");
            varieties.add("Snickers");
            varieties.add("Cadbury Crackles");
        }
        if (flavour.equals("Savoury Choclates")) {
            varieties.add("White Choclate with mint");
            varieties.add("Peanut Butter Choclate chews");
            varieties.add("Berry Bacon blast");
            varieties.add("ButterNut Caramel gum");
            varieties.add("Coco-cola spicy SourPunk");
        }
        return varieties;
    }
}
