package com.example.matthewtaila.memoirs;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.matthewtaila.memoirs.Model.Album;

import java.util.ArrayList;

/**
 * Created by matthewtaila on 9/18/16.
 */
public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.ViewHolder> {

    private ArrayList<Album> albumArrayList;
    private Context context;

    public AlbumAdapter(ArrayList<Album> albumArrayList, Context context) {
        this.albumArrayList = albumArrayList;
        this.context = context;
    }

    private Context getContext(){
        return context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View albumView = layoutInflater.inflate(R.layout.item_album_list_cardview, parent, false);
        ViewHolder viewHolder = new ViewHolder(albumView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Album album = albumArrayList.get(position);
        TextView titleTextView = holder.tvAlbumTitle;
        titleTextView.setText(album.getTitle());
    }

    @Override
    public int getItemCount() {
        return albumArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView tvAlbumTitle;
        public ViewHolder(View itemView) {
            super(itemView);
            tvAlbumTitle = (TextView)itemView.findViewById(R.id.tv_albumTitle);
        }
    }

}
