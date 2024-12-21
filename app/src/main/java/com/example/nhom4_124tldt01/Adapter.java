package com.example.nhom4_124tldt01;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

import java.util.List;

public class Adapter extends ArrayAdapter<ItemGV> {
    public Adapter(Context context, List<ItemGV> items) {
        super(context, 0, items);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item, parent, false);
            viewHolder = new Adapter.ViewHolder();
            viewHolder.id = convertView.findViewById(R.id.id);
            viewHolder.name = convertView.findViewById(R.id.name);
            viewHolder.msv = convertView.findViewById(R.id.msv);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (Adapter.ViewHolder) convertView.getTag();
        }
        ItemGV item = getItem(position);
        if (item != null) {
            viewHolder.id.setText(String.valueOf(item.getId()));
            viewHolder.name.setText(item.getName());
            viewHolder.msv.setText(item.getMsv());
        }


//        convertView.setOnClickListener(v ->
//                Toast.makeText(getContext(), "Clicked: " + gridItem.getTitle(), Toast.LENGTH_SHORT).show()
//        );

        return convertView;
    }

    static class ViewHolder {
        TextView id;
        TextView name;
        TextView msv;
    }
}
