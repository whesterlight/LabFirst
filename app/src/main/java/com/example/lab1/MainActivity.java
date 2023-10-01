package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView TextWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.TextWindow = findViewById(R.id.TextWindow);

        Button Buttonchik = (Button) findViewById(R.id.Buttonchik);
        Buttonchik.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                TextWindow.setText("New text)");
            }
        });
    }
}
