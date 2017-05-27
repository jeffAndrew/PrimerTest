package aejg.primertest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        Button gridv = (Button)findViewById(R.id.btngrid);
        gridv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListViewActivity.this,grid.class);
                startActivity(intent);
            }
        });

        ListView listView = (ListView)findViewById(R.id.listV);

        List<String>list = new ArrayList<>();
        for (int i = 0; i < 100;i++){
            list.add(Integer.toString(i + 1));
        }
       listView.setAdapter(new ArrayAdapter<>(this,R.layout.text,list));



    }
}
