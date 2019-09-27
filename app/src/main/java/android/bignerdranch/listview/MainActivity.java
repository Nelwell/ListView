package android.bignerdranch.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //An array to provide data for the list
    private final String[] mAndroidVersions = {"Jellybeans", "Kitkat", "Lollipop", "Marshmallow"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get a reference to the ListView
        ListView listView = findViewById(R.id.simple_list);

        // Create an ArrayAdapter, note generic type <String> used
        // Arguments are Context, the TextView's resource ID,
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.list_item, R.id.list_item_text,
                mAndroidVersions);

        // And set this ArrayAdapter to be the ListView's adapter
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                // The positions in the list correspond to array indexes
                String itemText = mAndroidVersions[position];
                Toast.makeText(MainActivity.this, itemText, Toast.LENGTH_SHORT).show();

            }
        });


    }
}
