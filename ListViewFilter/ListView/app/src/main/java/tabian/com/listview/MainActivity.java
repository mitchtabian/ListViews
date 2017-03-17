package tabian.com.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list = (ListView) findViewById(R.id.theList);
        EditText theFilter = (EditText) findViewById(R.id.searchFilter);
        Log.d(TAG, "onCreate: Started.");

        ArrayList<String> names = new ArrayList<>();
        names.add("Mitch");
        names.add("Blake");
        names.add("Shelly");
        names.add("Jess");
        names.add("Steve");
        names.add("Mohammed");

        adapter = new ArrayAdapter(this, R.layout.list_item_layout, names);
        list.setAdapter(adapter);

        theFilter.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                (MainActivity.this).adapter.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }
}
