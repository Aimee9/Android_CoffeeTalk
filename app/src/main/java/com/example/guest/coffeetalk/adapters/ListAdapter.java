package com.example.guest.coffeetalk.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.guest.coffeetalk.R;
import com.example.guest.coffeetalk.models.Post;

import java.util.ArrayList;

/**
 * Created by Guest on 11/4/15.
 */
public class ListAdapter extends BaseAdapter{

    private Context mContext;
    private ArrayList<Post>mPosts;

    public  ListAdapter(Context context, ArrayList<Post> posts) {
        mPosts = posts;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mPosts.size();
    }

    @Override
    public Object getItem(int position) {
        return mPosts.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if(convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.list_item, null);
            holder = new ViewHolder();
            holder.postLabel = (TextView)convertView.findViewById(R.id.postLabel);
            holder.userLabel = (TextView)convertView.findViewById(R.id.userLabel);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Post post = mPosts.get(position);
        holder.postLabel.setText(post.getMessage());
        holder.userLabel.setText("By: " + post.getUser().getName());

        return convertView;


    }
    private static class ViewHolder{
        TextView postLabel;
        TextView userLabel;
    }
}


