package aejg.primertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;

public class ScrollV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_v);
        LinearLayout lint = (LinearLayout)findViewById(R.id.LinScroll);

        for (int i=0; i < 15;i++){
            Button btnxml = (Button) LayoutInflater.from(this).inflate(R.layout.boton,null);
            btnxml.setText("Button" + i);
            lint.addView(btnxml);
        }

    }
}
