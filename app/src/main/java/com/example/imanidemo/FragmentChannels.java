package com.example.imanidemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FragmentChannels extends Fragment {
    private RecyclerView recyclerView;
    private List<ChannelsItems> itemsList;
    private ChannelsRecyclerViewAdapter recyclerViewAdapter;

    public FragmentChannels() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.channels_fragments, container, false);
        recyclerView = view.findViewById(R.id.channels_fragments);
        recyclerViewAdapter = new ChannelsRecyclerViewAdapter(getContext(), itemsList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(recyclerViewAdapter);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        itemsList = new ArrayList<>();

        itemsList.add(new ChannelsItems(R.drawable.image, "Wokovu Ministries", "Mombassa"));
        itemsList.add(new ChannelsItems(R.drawable.image, "CITAM", "Buruburu"));
        itemsList.add(new ChannelsItems(R.drawable.image, "Delivarance Church", "Em BulBul"));
    }
}
