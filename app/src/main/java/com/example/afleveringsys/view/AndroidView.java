package com.example.afleveringsys.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.InputDevice;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.afleveringsys.R;
import com.example.afleveringsys.model.Model;

import org.w3c.dom.Text;

public class AndroidView extends AppCompatActivity {

    TextView textview;
    Button button;
    EditText edittext;

    private Model model = new Model();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview=(TextView) findViewById(R.id.outputView);
        textview.setText(model.getData());

        button=(Button) findViewById(R.id.enterButton);

        edittext=(EditText) findViewById(R.id.InputText);
        edittext.setText(model.getData());

        }

        public void enterInput(View view) {
            EditText inputText = (EditText) findViewById(R.id.InputText);
            TextView outputView = (TextView) findViewById(R.id.outputView);

            String input = inputText.getText().toString();
            outputView.setText(input);
        }
    }

