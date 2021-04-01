package com.example.banglaletter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomBbanjon extends BaseAdapter {
    Context context;
    int[] bbanjon;
    LayoutInflater inflater;
    public CustomBbanjon(Context context, int[] bbanjon) {
        this.context = context;
        this.bbanjon = bbanjon;
        inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return bbanjon.length;
    }

    @Override
    public Object getItem(int i) {
        return bbanjon[i];
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
        imageView.setImageResource(bbanjon[i]);
        return convertView;
    }
}
