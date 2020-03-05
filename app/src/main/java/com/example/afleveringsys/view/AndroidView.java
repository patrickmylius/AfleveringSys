package com.example.afleveringsys.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.afleveringsys.R;

public class AndroidView extends AppCompatActivity {

    TextView textview;
    Button button;
    EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview=(TextView) findViewById(R.id.outputView);
        button=(Button) findViewById(R.id.enterButton);
        edittext=(EditText) findViewById(R.id.InputText);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textview.setText(" `` "  + edittext.getText() + " ´´ ");
            }
        });
    }


}
