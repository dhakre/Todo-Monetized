package com.example.qosmio.todo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.qosmio.todo.Models.todo;

import java.util.List;
import java.util.zip.Inflater;


/**
 * Created by Qosmio on 12/10/2016.
 */

public class customList extends ArrayAdapter {

    List<todo> tdlist;
    LayoutInflater inflater;
    Context c;
    public customList(Context context, int resource, List objects) {
        super(context, resource, objects);
        this.tdlist = objects;
        this.c = context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        if(convertView == null){
            inflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.singletodo,null);
        }

        ViewHolder holder = new ViewHolder();
        holder.title = (TextView) convertView.findViewById(R.id.textView2);
        holder.description = (TextView) convertView.findViewById(R.id.textView3);
        holder.date = (TextView) convertView.findViewById(R.id.textView4);


        holder.title.setText(tdlist.get(position).getTitle());
        holder.description.setText(tdlist.get(position).getDescription());
        holder.date.setText(tdlist.get(position).getDateTime());


        return convertView;
    }


class ViewHolder{

    TextView title;
    TextView description;
    TextView date;


}
}
