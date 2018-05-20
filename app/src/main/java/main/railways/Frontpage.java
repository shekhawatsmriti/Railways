package main.railways;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Frontpage extends AppCompatActivity {
    Button route, sta, sec, feed, fare, other, welcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frontpage);
        route = (Button) findViewById(R.id.button26);
        sta = (Button) findViewById(R.id.button17);
        sec = (Button) findViewById(R.id.button27);
        feed = (Button) findViewById(R.id.button30);
        fare = (Button) findViewById(R.id.button29);
        other = (Button) findViewById(R.id.button28);
        welcome =(Button)findViewById(R.id.button4);
        welcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://transport.rajasthan.gov.in/jmrc"));
                startActivity(i);
            }
        });
        sta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://transport.rajasthan.gov.in/jmrc"));
                startActivity(i);
            }
        });
        route.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Frontpage.this,Metro.class);
                startActivity(i);
            }
        });
        fare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://transport.rajasthan.gov.in/content/transportportal/en/metro/PassengerInformation/MetroFares.html "));
                startActivity(i);
            }
        });
        sec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Frontpage.this,Security.class);

                startActivity(i);
            }
        });
        other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Frontpage.this,Moreinfo.class);

                startActivity(i);
            }
        });
        feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Frontpage.this,Feedback.class);

                startActivity(i);
            }
        });
    }
}
