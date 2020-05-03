package com.example.imanidemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChannelsRecyclerViewAdapter extends RecyclerView.Adapter<ChannelsRecyclerViewAdapter.ChannelsViewHolder> {
    private Context context;
    private List<ChannelsItems> itemsList;

    public ChannelsRecyclerViewAdapter(Context context, List<ChannelsItems> itemsList) {
        this.context = context;
        this.itemsList = itemsList;
    }

    @NonNull
    @Override
    public ChannelsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.channels_items, parent, false);
        ChannelsViewHolder channelsViewHolder = new ChannelsViewHolder(view);
        return channelsViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ChannelsViewHolder holder, int position) {
        holder.image.setImageResource(itemsList.get(position).getImage());
        holder.channelName.setText(itemsList.get(position).getName());
        holder.channelLocation.setText(itemsList.get(position).getLocation());
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public static class ChannelsViewHolder extends RecyclerView.ViewHolder {
        public ImageView image;
        public TextView channelName, channelLocation;

        public ChannelsViewHolder(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.channel_image);
            channelName = itemView.findViewById(R.id.channel_name);
            channelLocation = itemView.findViewById(R.id.channel_location);
        }
    }
}
