package manoch.labs.android.imageswitcher;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.StackView;

import java.util.ArrayList;

/**
 * Created by Manoch Richard on 03-Nov-17.
 */

public class StackActivity extends Activity {
    private static StackView stackView;
    private static ArrayList list;

    private static final Integer[] icons = {R.drawable.eternity, R.drawable.everfirm,
            R.drawable.enliven, R.drawable.embellish, R.drawable.enliven};
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack);
        stackView = (StackView) findViewById(R.id.stack_view);
        list = new ArrayList();

        for (int i = 0; i < icons.length; i++) {
            list.add(new StackItems("Item " + i, icons[i]));
        }
        StackAdapter adapter = new StackAdapter(StackActivity.this, list);
        stackView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}
