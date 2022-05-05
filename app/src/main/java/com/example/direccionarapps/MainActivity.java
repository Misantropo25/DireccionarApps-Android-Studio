package com.example.direccionarapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton face,whats,you,tik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        face=findViewById(R.id.facebook);
        whats=findViewById(R.id.whatsapp);
        you=findViewById(R.id.youtube);
        tik=findViewById(R.id.tiktok);

        face.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent facebook = getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
                startActivity(facebook);
            }
        });

        whats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent whats = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
                startActivity(whats);
            }
        });

        you.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent youtube = getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
                startActivity(youtube);
            }
        });

        tik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tiktok = getPackageManager().getLaunchIntentForPackage("com.zhiliaoapp.musically");
                startActivity(tiktok);
            }
        });

    }
}