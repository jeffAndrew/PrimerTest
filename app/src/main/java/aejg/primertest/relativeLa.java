package aejg.primertest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class relativeLa extends AppCompatActivity {
    Button btntable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_la);

        btntable = (Button)findViewById(R.id.btnTable);
        btntable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(relativeLa.this,tableLa.class);
                startActivity(intent);
            }
        });
    }
}
