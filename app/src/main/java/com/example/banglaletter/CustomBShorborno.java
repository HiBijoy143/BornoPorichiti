package com.example.banglaletter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomBShorborno extends BaseAdapter {
    Context context;
    int[] bshorborno;
    LayoutInflater inflater;
    public CustomBShorborno(Context context, int[] bshorborno) {
        this.context = context;
        this.bshorborno = bshorborno;
        inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return bshorborno.length;
    }

    @Override
    public Object getItem(int i) {
        return bshorborno[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.sample_capital, null);

        }
        ImageView imageView = convertView.findViewById(R.id.capitralLetterId);
        imageView.setImageResource(bshorborno[i]);
        return convertView;
    }
}
