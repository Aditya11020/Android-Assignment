package com.example.myapplication_1;

import android.view.View;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.clevertap.android.sdk.ActivityLifecycleCallback;
import com.clevertap.android.sdk.CleverTapAPI;

public class MainActivity extends AppCompatActivity {

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ActivityLifecycleCallback.register(this.getApplication());
        super.onCreate(savedInstanceState);
        CleverTapAPI cleverTap = CleverTapAPI.getDefaultInstance(getApplicationContext());
        cleverTap.setDebugLevel(CleverTapAPI.LogLevel.DEBUG);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button b1 = findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_LONG).show();
            }
        });
        }
    }