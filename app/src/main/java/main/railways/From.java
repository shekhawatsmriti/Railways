package main.railways;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class From extends AppCompatActivity {
    ListView lt;
    String data[]={"Vivek Vihar","Shyam Nagar","Civil Lines","Sindhi Camp","Chandpole","Ramnagar","Jaipur Railway Station","Mansarovar","New Aatish Market"};
    static String m="",n="",o="",p="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from);
        lt=(ListView)findViewById(R.id.listView);
        ArrayAdapter<String> arr;
        arr=new ArrayAdapter<String>(From.this,R.layout.support_simple_spinner_dropdown_item,data);
        lt.setAdapter(arr);
        lt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String s=(String)parent.getItemAtPosition(position);
                if (s.equals("Vivek Vihar")) {
                    m = "No";
                    n = "7014991797";
                    o = "302015";
                    p = " 5153773";
                    Intent y = new Intent(From.this, Welcome.class);
                    y.putExtra("parking",m);
                    y.putExtra("hosp",n);
                    y.putExtra("police",o);
                    y.putExtra("help",p);
                    startActivity(y);
                }
                if (s.equals("Mansarovar")) {
                    m = "No";
                    n = "7949474561";
                    o = "302091";
                    p = "5153771";
                    Intent y = new Intent(From.this, Welcome.class);
                    y.putExtra("parking",m);
                    y.putExtra("hosp",n);
                    y.putExtra("police",o);
                    y.putExtra("help",p);
                    startActivity(y);
                }
                if (s.equals("Shyam Nagar")) {
                    m = "No";
                    n = "9873122834";
                    o = "302020";
                    p = " 515377";
                    Intent y = new Intent(From.this, Welcome.class);
                    y.putExtra("parking",m);
                    y.putExtra("hosp",n);
                    y.putExtra("police",o);
                    y.putExtra("help",p);
                    startActivity(y);
                }
                if (s.equals("Civil Lines")) {
                    m = "No";
                    o = "302017";
                    n = "9342517438";
                    p = " 5153776";
                    Intent y = new Intent(From.this, Welcome.class);
                    y.putExtra("parking",m);
                    y.putExtra("hosp",n);
                    y.putExtra("police",o);
                    y.putExtra("help",p);
                    startActivity(y);
                }
                if (s.equals("Sindhi Camp")) {
                    o = "302006";
                    m = "Yes";
                    n = "9753420019";
                    p = "5153778";
                    Intent y = new Intent(From.this, Welcome.class);
                    y.putExtra("parking",m);
                    y.putExtra("hosp",n);
                    y.putExtra("police",o);
                    y.putExtra("help",p);
                    startActivity(y);

                }
                if (s.equals("Ramnagar")) {
                    o = "302019";
                    m = "No";
                    n = "9843256170";
                    p = " 5153775";
                    Intent y = new Intent(From.this, Welcome.class);
                    y.putExtra("parking",m);
                    y.putExtra("hosp",n);
                    y.putExtra("police",o);
                    y.putExtra("help",p);
                    startActivity(y);
                }
                if (s.equals("Chandpole")) {
                    m = "No";
                    o = "302001";
                    n = "4537230987";
                    p = "5153779";
                    Intent y = new Intent(From.this, Welcome.class);
                    y.putExtra("parking",m);
                    y.putExtra("hosp",n);
                    y.putExtra("police",o);
                    y.putExtra("help",p);
                    startActivity(y);
                }
                if (s.equals("Jaipur Railway Station")) {
                    m = "Yes";
                    o = "302006";
                    n = "7098763421";
                    p = " 5153777";
                    Intent y = new Intent(From.this, Welcome.class);
                    y.putExtra("parking",m);
                    y.putExtra("hosp",n);
                    y.putExtra("police",o);
                    y.putExtra("help",p);
                    startActivity(y);
                }
                if (s.equals("New Aatish Market")) {
                    m = "Yes";
                    o = "302012";
                    n = "9876523416";
                    p = " 5153772";
                    Intent y = new Intent(From.this, Welcome.class);
                    y.putExtra("parking",m);
                    y.putExtra("hosp",n);
                    y.putExtra("police",o);
                    y.putExtra("help",p);
                    startActivity(y);
                }
            }
        });
    }
}
