package main.railways;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Security extends AppCompatActivity {
    Button dodon, safe, del;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security);
        dodon=(Button)findViewById(R.id.button11);
        safe=(Button)findViewById(R.id.button12);
        del=(Button)findViewById(R.id.button13);
        dodon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://jaipurmetrorail.in/Do%20and%20Dont"));
                startActivity(i);
            }
        });
        safe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.transport.rajasthan.gov.in/content/transportportal/en/metro/PassengerInformation/NotificationofDelaySuspension.html"));
                startActivity(i);
            }
        });
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://jaipurmetrorail.in/Do%20and%20Dont"));
                startActivity(i);
            }
        });
    }
}
