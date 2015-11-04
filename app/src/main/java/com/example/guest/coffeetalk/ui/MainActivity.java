package com.example.guest.coffeetalk.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.guest.coffeetalk.R;

public class MainActivity extends AppCompatActivity {

    private Button mDiscussButton;
    private EditText mPostText;
    private


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDiscussButton = (Button)findViewById(R.id.discussButton);
        mPostText = (EditText)findViewById(R.id.postText);

        mDiscussButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }

}
