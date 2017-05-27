package aejg.primertest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class grid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        Button btnScroll = (Button)findViewById(R.id.btnScroll);
        btnScroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(grid.this,ScrollV.class);
                startActivity(intent);
            }
        });

        GridView gridView = (GridView)findViewById(R.id.gridv);

        List<String> list = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            list.add(Integer.toString(i + 1));
        }
        gridView.setAdapter(new ArrayAdapter<>(this, R.layout.text,list));
    }
}
