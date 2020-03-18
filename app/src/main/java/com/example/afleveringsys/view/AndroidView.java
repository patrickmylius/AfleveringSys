package com.example.afleveringsys.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Display;
import android.view.InputDevice;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Observable;
import java.util.Observer;

import com.example.afleveringsys.R;
import com.example.afleveringsys.model.Model;

import org.w3c.dom.Text;

public class AndroidView extends AppCompatActivity {

    private Model model = new Model();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        observeModel(model);

        TextView outputView = (TextView) findViewById(R.id.outputView);
        outputView.setText(model.getData());

        EditText inputText = (EditText) findViewById(R.id.inputText);
        inputText.setText(model.getData());

        }

        private void observeModel(Model model) {
        model.addObserver(new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                if (o instanceof Model) {
                    String data = ((Model) o).getData();
                    TextView outputView = (TextView) findViewById(R.id.outputView);
                    outputView.setText(data);
                }
            }

        });

        }

        public void enterInput(View view) {
            EditText inputText = (EditText) findViewById(R.id.inputText);
            TextView outputView = (TextView) findViewById(R.id.outputView); // Unødvendig når linje 60 bliver slettet.

            String input = inputText.getText().toString();
            model.setData(input);
            outputView.setText(model.getData()); // Unødvendigt kald fordi Observer-mønstret allerede har sikret opdatering af outputView.

        }

    }

