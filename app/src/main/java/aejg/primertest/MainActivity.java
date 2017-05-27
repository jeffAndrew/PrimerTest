package aejg.primertest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    Button btnact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.tvNombre);
        TextView text = (TextView) findViewById(R.id.tvNombre);
        text.setText(R.string.MyNAme);

        btnact = (Button)findViewById(R.id.Btn2act);
        btnact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Actividad2.class);
                startActivity(intent);
            }
        });



    }
}
