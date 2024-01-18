package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onCllick(View view){
                // Log.i("HelloApp", "click");
                TextInputEditText textInputEditText = findViewById(R.id.textInputEditText);
                TextView textView = findViewById(R.id.textView);
                String name = textInputEditText.getText().toString();
                textView.setText(String.format("Hello %s!", name));
            }
        })
    }
}