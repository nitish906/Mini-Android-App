package com.masai.clicktochangename;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nitish=findViewById(R.id.button);
        Button sumedh=findViewById(R.id.button2);

        TextView text= findViewById(R.id.textView);


        nitish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    text.setText("Nitish");
            }
        });

        sumedh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText("Sumedh");
            }
        });
    }

}