package main.railways;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Moreinfo extends AppCompatActivity {
    Button k,k1,k2,k3,k4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moreinfo);
        k=(Button)findViewById(R.id.button5);
        k1=(Button)findViewById(R.id.button6);
        k2=(Button)findViewById(R.id.button7);
        k3=(Button)findViewById(R.id.button8);
        k4=(Button)findViewById(R.id.button3);

        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Moreinfo.this,About.class);
                startActivity(i);
            }
        });
        k1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Moreinfo.this,From.class);
                startActivity(i);
            }
        });
        k2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Moreinfo.this,Helpline.class);
                startActivity(i);
            }
        });
        k3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Moreinfo.this,Fare.class);
                startActivity(i);
            }
        });
        k4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Moreinfo.this,Map.class);
                startActivity(i);
            }
        });
    }
}
