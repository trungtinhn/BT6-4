package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.sql.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    int[] idImage = {R.drawable.lucas1, R.drawable.lucas2, R.drawable.lucas3,
            R.drawable.lucas4, R.drawable.lucas5};
    String[] name = {"Trung Tinh", "Thach Sang", "Le Dang Thuong", "Bui Cuong",
            "Le Khanh Duy"};
    String[] date = {"16/12/2003", "16/12/2003", "16/12/2003", "16/12/2003", "16/12/2003"};
    String[] Class = {"KTPM2021", "ATTT2021", "KHMT2021", "MMMTT2021", "CNTT2021"};
    String[] subject = {"Lap Trinh Huong Doi Tuong","Cau Truc Du Lieu Giai Thuat",
            "Nhap Mon Ung Dung Di Dong", "Phuong Phap Mo Hinh Hoa"};
    Student st;
    ArrayList<Student> mylist;
    ListView lv;
    ListAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = findViewById(R.id.ListView1);
        mylist = new ArrayList<>();
        for(int i = 0; i < name.length; i++){
            mylist.add(new Student("Name: " + name[i],"Date: " +date[i], "Class: "+ Class[i],subject,idImage[i]));
        }
        adapter = new ListAdapter(MainActivity.this, R.layout.custom_item, mylist);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent myintent = new Intent(MainActivity.this, SubActivity.class);
                myintent.putExtra("name", name[position]);
                myintent.putExtra("date", date[position]);
                myintent.putExtra("Class", Class[position]);
                myintent.putExtra("idImage", idImage[position]);
                myintent.putExtra("subject", subject);
            }
        });

    }

}