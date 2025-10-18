package com.example.ktgk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edtcc,edtcn;
    Button btntinh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        edtcc = findViewById(R.id.edtcc);
        edtcn = findViewById(R.id.edtcn);
        btntinh = findViewById(R.id.btntinh);
        double cc = Double.parseDouble(edtcc.getText().toString());
        double cn = Double.parseDouble(edtcn.getText().toString());
        btntinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("cc",cc);
                intent.putExtra("cn",cn);
                startActivity(intent);
            }
        });

    }
}