package com.example.android.jurnalburung;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Edit extends Fragment {
    View v;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.halaman_edit, container, false);
        v = inflater.inflate(R.layout.halaman_edit, container, false);

        ArrayList<Bird> birdArrayList =
                new ArrayList<>();
        birdArrayList.add(new Bird("kenari", R.drawable.kenari));
        birdArrayList.add(new Bird("kenari", R.drawable.kenari));
        birdArrayList.add(new Bird("kenari", R.drawable.kenari));

        recyclerView =  v.findViewById(R.id.recycleviewid);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(getContext());
        adapter = new Recyclerview_adapter(birdArrayList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        return  v;
    }
}
