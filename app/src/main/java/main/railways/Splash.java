package main.railways;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Thread th = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                    Intent v = new Intent(Splash.this,Frontpage.class);
                    startActivity(v);
                    finish();
                } catch (Exception f) {
                }
            }
        };
        th.start();
    }
}
