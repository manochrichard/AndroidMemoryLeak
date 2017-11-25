package manoch.labs.android.imageswitcher;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.AdapterViewFlipper;

/**
 * Created by Manoch Richard on 03-Nov-17.
 */

public class AdapterViewFlipperActivity extends AppCompatActivity {
    private AdapterViewFlipper simpleAdapterViewFlipper;
    int[] fruitImages = {R.drawable.embellish, R.drawable.enliven, R.drawable.eternity, R.drawable.everfirm, R.drawable.eternity};     // array of images
    String fruitNames[] = {"Apple", "Pine Apple", "Litchi", "Mango", "Banana"};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapterviewflipper);
        simpleAdapterViewFlipper = (AdapterViewFlipper) findViewById(R.id.simpleAdapterViewFlipper); // get the reference of AdapterViewFlipper
// Custom Adapter for setting the data in Views
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), fruitNames, fruitImages);
        simpleAdapterViewFlipper.setAdapter(customAdapter); // set adapter for AdapterViewFlipper
// set interval time for flipping between views
        simpleAdapterViewFlipper.setFlipInterval(3000);
// set auto start for flipping between views
        simpleAdapterViewFlipper.setAutoStart(true);
    }

}
