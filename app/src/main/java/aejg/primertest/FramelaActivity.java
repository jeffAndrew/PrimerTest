package aejg.primertest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FramelaActivity extends AppCompatActivity {
    Button btnlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_framelayout);
        btnlist =(Button)findViewById(R.id.btnlistview);
        btnlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FramelaActivity.this,ListViewActivity.class);
                startActivity(intent);
            }
        });
    }
}
