package main.railways;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {
 TextView t1,t2,t3,t4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        t1=(TextView)findViewById(R.id.textView12);
        t2=(TextView)findViewById(R.id.textView13);
        t3=(TextView)findViewById(R.id.textView14);
        t4=(TextView)findViewById(R.id.textView15);
        Intent y=getIntent();
        t1.setText(y.getStringExtra("parking"));
        t2.setText(y.getStringExtra("hosp"));
        t3.setText(y.getStringExtra("police"));
        t4.setText(y.getStringExtra("help"));

    }
}
