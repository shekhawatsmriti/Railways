package main.railways;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Metro extends AppCompatActivity {
    EditText t, t1;
    Button k, k1, k2, k3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metro);
        t = (EditText) findViewById(R.id.editText);
        t1 = (EditText) findViewById(R.id.editText2);
        k2 = (Button) findViewById(R.id.button9);
        k3 = (Button) findViewById(R.id.button10);
        k = (Button) findViewById(R.id.button);
        k1 = (Button) findViewById(R.id.button2);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q = new Intent(Metro.this, Toll.class);
                startActivity(q);
            }
        });
        t.setText(Toll.u);

        k1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q=new Intent(Metro.this,To.class);
                startActivity(q);
            }
        });
        t1.setText(To.r);

        k2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q=new Intent(Metro.this,Find.class);
                startActivity(q);
            }
        });
        k3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent q=new Intent(Metro.this,Moreinfo.class);
                startActivity(q);
            }
        });
    }
}
