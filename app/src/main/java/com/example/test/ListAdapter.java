package com.example.test;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<Student> {
    Activity Context;
    int IdLayout;
    ArrayList<Student> mylist;
    public ListAdapter(Activity context, int idLayout, ArrayList<Student> studentArrayList){
        super(context, idLayout, studentArrayList);
        this.Context = context;
        IdLayout = idLayout;
        this.mylist = studentArrayList;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater mylayout = Context.getLayoutInflater();

        convertView = mylayout.inflate(IdLayout, null);

        Student student = mylist.get(position);

        ImageView image = convertView.findViewById(R.id.image);
        TextView name = convertView.findViewById(R.id.name);
        TextView date = convertView.findViewById(R.id.date);
        TextView classtudent = convertView.findViewById(R.id.classtudent);

        image.setImageResource(student.getId());
        name.setText(student.getName());
        date.setText(student.getDate());
        classtudent.setText(student.getclass());

        return convertView;
    }
}
