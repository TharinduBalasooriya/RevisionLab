package com.example.revisonlab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnOK;
    EditText etx1;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etx1 = findViewById(R.id.editText1);
        btnOK = (Button) findViewById(R.id.btn);
        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = getApplicationContext();
                Intent i = new Intent(MainActivity.this,ReaderCollection.class);
                startActivity(i);

                name = etx1.getText().toString();
                Toast.makeText(MainActivity.this,"Welcome " +name + "!" + "\n Please Enter what you read",Toast.LENGTH_LONG).show();


            }
        });
    }




}
