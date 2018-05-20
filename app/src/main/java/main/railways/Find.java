package main.railways;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Find extends AppCompatActivity {
    TextView t, t1, t6,t3,t4,t5;
    int j = 0, k = 0, c = 0;
    public String list[] = {"Vivek Vihar", "Shyam Nagar", "Civil Lines","Sindhi Camp", "Chandpole", "Ramnagar", "Jaipur Railway Station", "Mansarovar", "New Aatish Market"};
    String s, d, ll = "\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);
        t = (TextView) findViewById(R.id.textView5);
        t1 = (TextView) findViewById(R.id.textView16);
        t3 = (TextView) findViewById(R.id.textView19);
        t4 = (TextView) findViewById(R.id.textView23);
        t5 = (TextView) findViewById(R.id.textView24);
        t6 = (TextView) findViewById(R.id.textView25);
        t.setText(Toll.u);
        t1.setText(To.r);
        cost();
        time();
        platform();
        inbetween();

    }

    public void cost() {
        for (j = 0; j <= 8; j++) {
            if (list[j].equals(Toll.u))
                break;
        }
        for (k = 0; k <= 8; k++) {
            if (list[k].equals(To.r))
                break;
        }

        c =Math.abs(k - j);
        if (c <= 2) {
            t3.setText("6 Rs");
        } else if (c > 2 && c <= 5) {
            t3.setText("11 Rs");
        } else if (c > 5) {
            t3.setText("17 Rs");
        }
    }
    public void inbetween() {
        if (j > k) {
            for (int q = j - 1; q >= k + 1; q--) {
                ll = ll + list[q] + "\n" + "\n";
            }
            t4.setText(ll);
        }
        if (j < k) {
            for (int q = j + 1; q <= k - 1; q++) {
                ll = ll + list[q] + "\n" + "\n";
            }
            t4.setText(ll);
        }
    }

    public void platform() {
        if (j < k) {
            t5.setText("1");
        }
        if (j > k) {
            t5.setText("2");
        }
    }
    public void time()
    {
        int time=(int)2.5;
        String t=String.valueOf(time);
        for(j=1;j<=8;j++)
        {
            String v=String.valueOf(time);
            t6.setText(v);
            time=time+time;
        }
    }
}

