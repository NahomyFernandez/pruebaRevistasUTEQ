package com.example.pruebarevistasuteq;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdaptadorRevistas extends ArrayAdapter<Revistas> {
    public AdaptadorRevistas(Context context, ArrayList<Revistas> datos) {
        super(context, R.layout.lyrevistas, datos);
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.lyrevistas, null);

        TextView lblTitulo = (TextView)item.findViewById(R.id.lblAño);
        lblTitulo.setText(getItem(position).getAnio());

        TextView lblSubtitulo = (TextView)item.findViewById(R.id.lblMes);
        lblSubtitulo.setText(getItem(position).getMes());

        TextView lblSubtitulo2 = (TextView)item.findViewById(R.id.lblUrl);
        lblSubtitulo2.setText(getItem(position).getUrlpdf());

        ImageView imageView = (ImageView)item.findViewById(R.id.imgRv);
        Glide.with(this.getContext())
                .load(getItem(position).getUrlportada())
                .into(imageView);

        return(item);
    }
}
