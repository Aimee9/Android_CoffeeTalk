package com.example.guest.coffeetalk.ui;

import android.app.ListActivity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

import com.example.guest.coffeetalk.R;
import com.example.guest.coffeetalk.adapters.ListAdapter;
import com.example.guest.coffeetalk.models.Post;
import com.example.guest.coffeetalk.models.User;

import java.util.ArrayList;

public class PostsActivity extends ListActivity {
    private Button mDiscussButton;
    private EditText mPostText;
    private ArrayList<Post> mPosts;
    private User mUser;
    private ListAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posts);

        mDiscussButton = (Button)findViewById(R.id.discussButton);
        mPostText = (EditText)findViewById(R.id.postText);
        mPosts = (ArrayList)Post.all();
        mAdapter = new ListAdapter(this, mPosts);
        setListAdapter(mAdapter);

        mDiscussButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userMessage = mPostText.getText().toString();
                Post post = new Post(mUser, userMessage);
                post.save();
                mPosts.add(post);
                mAdapter.notifyDataSetChanged();

                mPostText.setText("");
                InputMethodManager inputManager = (InputMethodManager)
                        getSystemService(Context.INPUT_METHOD_SERVICE);

                inputManager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(),
                        InputMethodManager.HIDE_NOT_ALWAYS);


            }
        });


    }

}
