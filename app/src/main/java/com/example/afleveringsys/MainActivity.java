package com.example.afleveringsys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textview;
    Button button;
    EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview=(TextView) findViewById(R.id.TextViewChange);
        button=(Button) findViewById(R.id.buttonClick);
        edittext=(EditText) findViewById(R.id.InputEditText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.setText("Hello, button works very well");
            }
        });
    }
}
