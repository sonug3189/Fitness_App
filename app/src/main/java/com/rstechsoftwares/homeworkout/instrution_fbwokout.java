package com.rstechsoftwares.homeworkout;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class instrution_fbwokout  extends ArrayAdapter<String>
{
    private final Context context;
    private final String[] itemname;
    private final Integer[] imgid;

    public instrution_fbwokout(Activity context,String[] itemname,Integer[] imgid)
    {
        super(context,R.layout.mylist,itemname);
        this.context=context;
        this.itemname=itemname;
        this.imgid=imgid;

    }

    public View getView(int position, View view, ViewGroup parent)
    {
        LayoutInflater inflater = LayoutInflater.from(context);

        //LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist,null,true);

        TextView textTitle=(TextView)rowView.findViewById(R.id.aNametxt);
        ImageView imageView=(ImageView)rowView.findViewById(R.id.appIconIV);

        textTitle.setText(itemname[position]);
        imageView.setImageResource(imgid[position]);
        return rowView;

    };



}
