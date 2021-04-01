package com.example.banglaletter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomENumberAdapter extends BaseAdapter {
    Context context;
    int[] enumber;
    LayoutInflater inflater;

    public CustomENumberAdapter(Context context, int[] enumber) {
        this.context = context;
        this.enumber = enumber;
        inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return enumber.length;
    }

    @Override
    public Object getItem(int i) {
        return enumber[i];
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
        imageView.setImageResource(enumber[i]);
        return convertView;
    }
}
