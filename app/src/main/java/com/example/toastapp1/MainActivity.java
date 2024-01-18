package com.example.toastapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edt_toast;
    Button btn_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_toast = findViewById(R.id.edt_toast);
        btn_show = findViewById(R.id.btn_show);

        btn_show.setOnClickListener(view -> {

            if(!edt_toast.getText().toString().trim().isEmpty()) {
                Toast.makeText(getApplicationContext(), edt_toast.getText().toString().trim(), Toast.LENGTH_LONG).show();
            }else {
                Toast.makeText(this, "Please Enter Some Message For showing Toast !", Toast.LENGTH_SHORT).show();
            }
        });

    }
}