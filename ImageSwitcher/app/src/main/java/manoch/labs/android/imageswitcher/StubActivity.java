package manoch.labs.android.imageswitcher;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;

/**
 * Created by Manoch Richard on 03-Nov-17.
 */

public class StubActivity extends AppCompatActivity {
    ViewStub simpleViewStub;
    Button showButton, hideButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stub);
        simpleViewStub = ((ViewStub) findViewById(R.id.simpleViewStub)); // get the reference of ViewStub
        simpleViewStub.inflate(); // inflate the layout
        showButton = (Button) findViewById(R.id.showButton); // get the reference of show button
        hideButton = (Button) findViewById(R.id.hideButton); // get the reference of hide buttton
// perform click event on show button
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// set VISIBLE visibility of ViewStub
                simpleViewStub.setVisibility(View.VISIBLE);
            }
        });
// perform click event on hide button
        hideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// set GONE visibility of ViewStub
                simpleViewStub.setVisibility(View.GONE);
            }
        });
    }
}
