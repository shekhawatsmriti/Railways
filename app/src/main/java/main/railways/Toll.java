package main.railways;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Toll extends AppCompatActivity {
    ListView lt1;
    String data[] = {"Vivek Vihar", "Shyam Nagar", "Civil Lines", "Sindhi Camp", "Chandpole", "Ramnagar", "Jaipur Railway Station", "Mansarovar", "New Aatish Market"};
    static String u;
    ArrayAdapter<String> arr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toll);
        lt1 = (ListView) findViewById(R.id.listView2);
        arr = new ArrayAdapter<String>(Toll.this, R.layout.support_simple_spinner_dropdown_item, data);
        lt1.setAdapter(arr);
        lt1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                u = (String) parent.getItemAtPosition(position);
                Intent i = new Intent(Toll.this, Metro.class);
                startActivity(i);
            }
        });
    }
}
