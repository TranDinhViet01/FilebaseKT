package com.example.demofire;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterThuoc extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Thuoc> ListThuoc;
    public AdapterThuoc(Context context, int layout, List<Thuoc> listThuoc) {
        this.context = context;
        this.layout = layout;
        ListThuoc = listThuoc;
    }
    @Override
    public int getCount() {
        return ListThuoc.size();
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
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);

        ImageView imgHinh = (ImageView) view.findViewById(R.id.Hinh);
        TextView textTen = (TextView) view.findViewById(R.id.Ten);
        TextView textDacTinh = (TextView) view.findViewById(R.id.dacTinh);
        TextView textCongDung = (TextView) view.findViewById(R.id.LieuDung);
        TextView textLieuThuoc = (TextView) view.findViewById(R.id.dacTinh);
        Thuoc thuoc = ListThuoc.get(i);
        imgHinh.setImageResource(thuoc.getHinh());
        textTen.setText(thuoc.getTen());
        textDacTinh.setText(thuoc.getDacTinh());
        textCongDung.setText(thuoc.getCongDung());
        textLieuThuoc.setText(thuoc.getLieuThuoc());
        return view;
    }
}
