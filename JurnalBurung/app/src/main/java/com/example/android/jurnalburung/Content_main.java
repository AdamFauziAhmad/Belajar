package com.example.android.jurnalburung;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Content_main extends Fragment {
View v;
//RecyclerView recyclerView;
//List<Bird> birdList;
//Recyclerview_adapter recyclerview_adapter;

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.content_main, container, false);

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


//        return inflater.inflate(R.layout.cardview_item, container, false);



        return v;
    }

//    @Override
//    public void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
////        birdList = new ArrayList<>();
////        birdList.add(new Bird("Kenari","Deksripsi Kenari",R.drawable.kenari));
////        birdList.add(new Bird("Kenari","Deksripsi Kenari",R.drawable.kenari));
////        birdList.add(new Bird("Kenari","Deksripsi Kenari",R.drawable.kenari));
////
////        recyclerView = v.findViewById(R.id.recycleviewid);
////        recyclerview_adapter = new Recyclerview_adapter(birdList,getContext());
////        recyclerView.setAdapter(recyclerview_adapter);
////        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),1));
//
////        birdList = new ArrayList<>();
////        birdList.add(new Bird("Kenari","Deksripsi Kenari",R.drawable.kenari));
////        birdList.add(new Bird("Kenari","Deksripsi Kenari",R.drawable.kenari));
////        birdList.add(new Bird("Kenari","Deksripsi Kenari",R.drawable.kenari));
////
////        RecyclerView myrv = null;
////        myrv = myrv.findViewById(R.id.recycleviewid);
////        Recyclerview_adapter myadap = new Recyclerview_adapter(birdList, getContext());
////        myrv.setLayoutManager(new GridLayoutManager(getContext(), 1));
////        myrv.setAdapter(myadap);
//
//    }
}
