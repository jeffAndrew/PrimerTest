package aejg.primertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Spin extends AppCompatActivity implements OnClickListener{
    private Spinner mSpinner;
    private String[] data = {"Perro","Gato","Mouse"};
    private String TITTLE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spin);
        getSupportActionBar().setTitle(getIntent().getStringExtra(TITTLE));
        mSpinner = (Spinner)findViewById(R.id.my_spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, data);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        findViewById(R.id.Boton_Spin).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, mSpinner.getSelectedItem().toString(), Toast.LENGTH_LONG).show();
    }
}
