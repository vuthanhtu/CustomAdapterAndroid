package com.example.learnbasicandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class TraiCayAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<TraiCay> traiCayList;//list hien thi du lieu


    public TraiCayAdapter(Context context, int layout, List<TraiCay> traiCayList) {
        this.context = context;
        this.layout = layout;
        this.traiCayList = traiCayList;
    }

    @Override
    public int getCount() {
        //so dong hien thi tren listview
        return traiCayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);
        //anh xa view
        TextView txtTen = (TextView) view.findViewById(R.id.idTVTen);
        TextView txtMoTa = (TextView) view.findViewById(R.id.idTVMoTa);
        ImageView imgTraiCay = (ImageView) view.findViewById(R.id.idIVTraiCay);
        //gan gia tri
        TraiCay traiCay = traiCayList.get(i);
        txtTen.setText(traiCay.getTen());
        txtMoTa.setText(traiCay.getMota());
        imgTraiCay.setImageResource(traiCay.getHinh());
        return view;
    }
}
