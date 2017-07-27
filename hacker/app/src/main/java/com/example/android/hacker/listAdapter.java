package com.example.android.hacker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.android.hacker.R.id.imageView;
import static com.example.android.hacker.R.id.vid;

/**
 * Created by Ninaad on 7/26/2017.
 */

public class listAdapter extends BaseAdapter {
    Context context;
    String[] title;
    String[] pay;
    String[] upvote;
    String[] video;

    public listAdapter(Context context,String[] title,String[] pay,String[] upvote,String[] video)
    {
     this.context=context;
        this.title=title;
        this.pay=pay;
        this.upvote=upvote;
        this.video=video;
    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int position) {
        return title[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View list;
        LayoutInflater inflater = (LayoutInflater)context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (convertView == null) {

            list = new View(context);
            list = inflater.inflate(R.layout.list_black, null);
            TextView titles = (TextView) list.findViewById(R.id.list_content);
            TextView pays = (TextView)list.findViewById(R.id.pay);
            TextView upvotes=(TextView)list.findViewById(R.id.votes);
            TextView videos=(TextView)list.findViewById(vid);
           // TextView upvote=(TextView)list.findViewById(R.id.votes);
            titles.setText(title[position].toString());
            pays.setText(pay[position].toString());
           upvotes.setText(upvote[position].toString());
            videos.setText(video[position].toString());


        } else {
            list = (View) convertView;
        }

        return list;
    }
}
