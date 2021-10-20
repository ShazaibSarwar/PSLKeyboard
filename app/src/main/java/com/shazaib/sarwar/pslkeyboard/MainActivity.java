package com.shazaib.sarwar.pslkeyboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_choose_input;
        Button btn_setup_input;
        btn_setup_input = findViewById(R.id.button2);
        btn_choose_input = findViewById(R.id.button);

        btn_choose_input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager imeManager = (InputMethodManager) getApplicationContext().getSystemService(INPUT_METHOD_SERVICE);
                imeManager.showInputMethodPicker();
            }
        });

        btn_setup_input.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                InputMethodManager imeManager = (InputMethodManager) getApplicationContext().getSystemService(INPUT_METHOD_SERVICE);
//                imeManager.showInputMethodAndSubtypeEnabler();
            }
        });
    }
}