package com.abid.spineer2ndway;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Spinner sp;
    Button btn;
    TextView tx;
    String country[],desc[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp = findViewById(R.id.spinner);
        btn = findViewById(R.id.button);
        tx = findViewById(R.id.textView);

        country = getResources().getStringArray(R.array.country);
        desc = getResources().getStringArray(R.array.values);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,country);
        sp.setAdapter(adapter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index = sp.getSelectedItemPosition();
                tx.setText(""+desc[index]);
            }
        });
    }
}