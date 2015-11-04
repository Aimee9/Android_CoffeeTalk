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

public class RegisterActivity extends AppCompatActivity {

    private EditText mNameText;
    private Button mSubmitButton;
    private SharedPreferences mPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        mNameText = (EditText)findViewById(R.id.nameText);
        mSubmitButton = (Button)findViewById(R.id.submitButton);
        mPreferences = getApplicationContext().getSharedPreferences("post", Context.MODE_PRIVATE);

        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mNameText.getText().toString();
                SharedPreferences.Editor editor = mPreferences.edit();
                editor.putString("username", name);
                editor.commit();
                Intent intent = new Intent(RegisterActivity.this, PostsActivity.class);
                startActivity(intent);

            }
        });


    }


}
