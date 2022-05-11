package com.example.myapplication;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button BT_enter;
        EditText editText_word = (EditText) findViewById(R.id.editTextTextPersonName2);
        TextView Text_TheWall = (TextView) findViewById(R.id.textView);
        BT_enter = (Button) findViewById(R.id.button);
        BT_enter.setText("Enter word");
        BT_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = String.valueOf(editText_word.getText());
                Text_TheWall.setText(text+"f");
            }
        });
    }
}