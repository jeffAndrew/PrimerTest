package aejg.primertest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tableLa extends AppCompatActivity {
    Button btnfm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_la);
        btnfm = (Button)findViewById(R.id.btnfm);
        btnfm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tableLa.this,FramelaActivity.class);
                startActivity(intent);
            }
        });
    }
}
