package com.example.ktgk;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    TextView txtkqso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        txtkqso=findViewById(R.id.txtkqso);
        Intent intent = getIntent();
        double cc = intent.getDoubleExtra("cc",0);
        double cn = intent.getDoubleExtra("cn",0);
        double ketqua = cn/(cc*cc);
        txtkqso.setText("kết quả bmi cua bạn: " + String.format("%.2f",ketqua));
    }
}