package com.mapobridge.sundaydev.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

/**
 * Created by kimdongsik on 2015. 5. 12..
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder>{

    private Context context;
    private ArrayList<String> dataList;

    public MainAdapter(Context context, ArrayList<String> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rowView = LayoutInflater.from(parent.getContext()).inflate(R.layout.main_item_row, parent, false);
        ViewHolder viewHolder = new ViewHolder(rowView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(dataList.get(position));
        String url = "http://photo4love.com/sp/ng_wall/National%20Geographic%20Wallpapers%"+(position+20001)+".jpg";
        Glide.with(holder.imageView.getContext()).load(url).into(holder.imageView);
        Log.e("DSKIM", "DSKIM : " + url);
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }


    static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView textView = null;
        public ImageView imageView = null;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.main_row_textview);
            imageView = (ImageView) itemView.findViewById(R.id.main_row_imgview);
        }
    }
}
