package com.example.guest.coffeetalk.ui;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
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
import com.parse.ParseObject;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button mEnterButton;
    private SharedPreferences mPreferences;
    private User mUser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mPreferences = getApplicationContext().getSharedPreferences("post", Context.MODE_PRIVATE);

        mEnterButton = (Button) findViewById(R.id.enterButton);

//        if (!isRegistered()) {
//            Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
//            startActivity(intent);

            mEnterButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, PostsActivity.class);
                    startActivity(intent);
                }

            });

        }
    }

//    private boolean isRegistered() {
//        String username = mPreferences.getString("username", null);
//        if (username == null) {
//            return false;
//        } else {
//            setUser(username);
//            return true;
//        }
//    }
//
//    private void setUser(String username) {
//        User user = User.find(username);
//        if (user != null) {
//            mUser = user;
//        } else {
//            mUser = new User(username);
//            mUser.save();
//        }
//    }
//}
