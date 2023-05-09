package com.example.test;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<Student> {

    public ListAdapter(Context context, ArrayList<Student> studentArrayList){
        super(context, R.layout.custom_item, studentArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Student student = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.custom_item,parent, false);
        }
        ImageView image = convertView.findViewById(R.id.image);
        TextView name = convertView.findViewById(R.id.name);
        TextView date = convertView.findViewById(R.id.date);
        TextView classstudent= convertView.findViewById(R.id.classstudent);

        image.setImageResource(student.getId());
        name.setText(student.getName());
        date.setText(student.getDate());
        classstudent.setText(student.getclass());

        return super.getView(position, convertView, parent);
    }
}
