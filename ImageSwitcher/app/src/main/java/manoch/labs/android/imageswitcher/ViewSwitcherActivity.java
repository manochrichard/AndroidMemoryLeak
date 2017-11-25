package manoch.labs.android.imageswitcher;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ViewSwitcher;

/**
 * Created by Manoch Richard on 03-Nov-17.
 */

public class ViewSwitcherActivity extends AppCompatActivity {
    private ViewSwitcher simpleViewSwitcher;
    Button btnNext;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewswitcher);
        btnNext = (Button) findViewById(R.id.buttonNext);
        simpleViewSwitcher = (ViewSwitcher) findViewById(R.id.simpleViewSwitcher); // get the reference of ViewSwitcher
// Declare in and out animations and load them using AnimationUtils class
        Animation in = AnimationUtils.loadAnimation(this, android.R.anim.slide_in_left);
        Animation out = AnimationUtils.loadAnimation(this, android.R.anim.slide_out_right);

// set the animation type to ViewSwitcher
        simpleViewSwitcher.setInAnimation(in);
        simpleViewSwitcher.setOutAnimation(out);


// ClickListener for NEXT button
// When clicked on Button ViewSwitcher will switch between views
// The current view will go out and next view will come in with specified animation
        btnNext.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
// TODO Auto-generated method stub
// show the next view of ViewSwitcher
                simpleViewSwitcher.showNext();
            }
        });
    }
}
