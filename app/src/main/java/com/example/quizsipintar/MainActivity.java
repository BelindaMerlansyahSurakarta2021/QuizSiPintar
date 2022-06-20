package com.example.quizsipintar;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.quizsipintar.model.User;

public class MainActivity extends AppCompatActivity {
    Button Go, His;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Go=findViewById(R.id.btnGo);
        His=findViewById(R.id.btnHis);

        Go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //membuat object intent berpindah activity dari main activity ke activity hasil
                Intent p = new Intent(getApplicationContext(),EditorActivity.class);
                //berpindah ke Activity register
                startActivity(p);
            }
        });
        His.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //membuat object intent berpindah activity dari main activity ke activity hasil
                Intent p = new Intent(getApplicationContext(), History.class);
                //berpindah ke Activity register
                startActivity(p);
            }
        });
    }
}