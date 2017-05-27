package aejg.primertest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Actividad2 extends AppCompatActivity {
    Button btnrela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);

        btnrela = (Button)findViewById(R.id.btnrela);
        btnrela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Actividad2.this,relativeLa.class);
                startActivity(intent);
            }
        });
    }
}
