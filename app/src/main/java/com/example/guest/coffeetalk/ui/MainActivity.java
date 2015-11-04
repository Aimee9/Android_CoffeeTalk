package com.example.guest.coffeetalk.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.guest.coffeetalk.R;
import com.example.guest.coffeetalk.models.Post;
import com.example.guest.coffeetalk.models.User;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button mEnterButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEnterButton = (Button) findViewById(R.id.enterButton);

        mEnterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PostsActivity.class);
                startActivity(intent);
            }
        });



    }

}
