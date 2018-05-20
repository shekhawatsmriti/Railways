package main.railways;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class To extends AppCompatActivity {
    ListView lt;
    String data[] = {"Vivek Vihar", "Shyam Nagar", "Civil Lines", "Sindhi Camp", "Chandpole", "Ramnagar", "Jaipur Railway Statio", "Mansarovar", "New Aatish Market"};
    static String r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to);
        lt = (ListView) findViewById(R.id.listView3);
        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<String>(To.this, R.layout.support_simple_spinner_dropdown_item, data);
        lt.setAdapter(arr);
        lt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                r = (String) parent.getItemAtPosition(position);
                Intent i = new Intent(To.this, Metro.class);
                startActivity(i);
            }
        });
    }
}