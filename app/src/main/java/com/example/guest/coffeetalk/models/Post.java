package com.example.guest.coffeetalk.models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.activeandroid.query.Select;

import java.util.List;

/**
 * Created by Guest on 11/4/15.
 */

@Table(name = "Posts", id = "_id")
public class Post extends Model{

    @Column(name = "User")
    private User mUser;

    @Column(name = "Message")
    private String mMessage;

    public Post() {
        super();
    }

    public Post(User user, String message) {
        mUser = user;
        mMessage = message;
    }

    public String getMessage() {
        return mMessage;
    }

    public void setMessage(String message) {
        mMessage = message;
    }

    public User getUser() {
        return mUser;
    }

    public void setUser(User user) {
        mUser = user;
    }

    public static List<Post> all() {
        return new Select()
                .from(Post.class)
                .execute();
    }
}
