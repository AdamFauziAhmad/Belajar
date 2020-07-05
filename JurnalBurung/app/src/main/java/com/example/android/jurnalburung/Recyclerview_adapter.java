package com.example.android.jurnalburung;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Recyclerview_adapter extends RecyclerView.Adapter<Recyclerview_adapter.Myviewholder> {
    private ArrayList<Bird> mData;
    private Context context;
//    private List<Bird> mData;

    public Recyclerview_adapter(ArrayList<Bird> birdlist){
        mData = birdlist;


    }


//    public Recyclerview_adapter(List<Bird> mData, Context context) {
//        this.mData = mData;
//        this.context = context;
//    }

    @Override
    public Myviewholder onCreateViewHolder(ViewGroup parent, int viewType) {
//        View view;
//        LayoutInflater inflater = LayoutInflater.from(context);
//        view = inflater.inflate(R.layout.cardview_item,parent, false);
//
//        return new Myviewholder(view);
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_item, parent, false);
        Myviewholder myviewholder = new Myviewholder(v);
        return myviewholder;
    }


    @Override
    public void onBindViewHolder(Myviewholder holder, int position) {
        Bird curentItem = mData.get(position);

        holder.gambar_burung.setImageResource(curentItem.getThumbnail());
        holder.tv_namaburung.setText(curentItem.getJudul());
    }

//    @Override
//    public void onBindViewHolder(Myviewholder holder, int position) {
//        holder.tv_namaburung.setText(mData.get(position).getJudul());
//        holder.gambar_burung.setImageResource(mData.get(position).getThumbnail());
//
//    }

    @Override
    public int getItemCount() {

        return mData.size();
    }

    public static class Myviewholder extends RecyclerView.ViewHolder {

        TextView tv_namaburung;
        ImageView gambar_burung;



        public Myviewholder(View itemView) {
        super(itemView);

        tv_namaburung = itemView.findViewById(R.id.namaburung);
        gambar_burung = itemView.findViewById(R.id.gambarburung);
    }
}

}
