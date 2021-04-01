package com.example.banglaletter;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.SimpleCursorAdapter;

import java.security.PrivateKey;

public class CustomCapitalAdapter extends BaseAdapter {

    Context context;
    int[] capital;
    LayoutInflater inflater;

    public CustomCapitalAdapter(Context context, int[] capital) {
        this.context = context;
        this.capital = capital;
        inflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return capital.length;
    }

    @Override
    public Object getItem(int i) {
        return capital[i];
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
        imageView.setImageResource(capital[i]);
        return convertView;
    }
}
