package com.example.chapter3.homework;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


public class ListViewAdapt extends BaseAdapter {
    private LayoutInflater mInflater;

    public ListViewAdapt(Context context){
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 7;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if(convertView == null){
            viewHolder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.item,null);
            viewHolder.textView = convertView.findViewById(R.id.tv);
            convertView.setTag(viewHolder);
        }
        else
            viewHolder = (ViewHolder) convertView.getTag();
        viewHolder.textView.setText("Item " + position);
        return convertView;
    }

    private final class ViewHolder {
        private TextView textView;
    }
}