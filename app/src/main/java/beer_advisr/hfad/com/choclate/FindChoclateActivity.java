package beer_advisr.hfad.com.choclate;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View;
import java.util.List;

public class FindChoclateActivity extends Activity {
    //id spinner=flavour button=find_choc textView=varieties

    // brands=varieties color=flavour beertype=choctype

    private ChocExpert expert = new ChocExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_choclate);
    }

    public void onClickFindChoc(View view) {

        TextView varieties = (TextView) findViewById(R.id.varieties);
        Spinner flavour = (Spinner) findViewById(R.id.flavour);
        String choctype = String.valueOf(flavour.getSelectedItem());
        //Get Recommendations from the chocExpert class
        List<String> chocsList = expert.getVarieties(choctype);
        StringBuilder varietiesFormatted = new StringBuilder();
        for (String variety : chocsList) {
            varietiesFormatted.append(variety).append('\n');
        }
        //get the names of choc's
        varieties.setText(varietiesFormatted);
    }
}



