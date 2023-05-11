package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {
    ImageView image;
    TextView name,date,Class;
    ListView lv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        image = findViewById(R.id.image);
        name = findViewById(R.id.name);
        date = findViewById(R.id.date);
        Class = findViewById(R.id.classtudent);
        lv1 = findViewById(R.id.ListView);

        Intent myintent = this.getIntent();
        String Name = myintent.getStringExtra("name");
        int id = myintent.getIntExtra("idImage", R.drawable.lucas1);
        String Date = myintent.getStringExtra("date");
        String classhs = myintent.getStringExtra("Class");
        String[] datasub = myintent.getStringArrayExtra("subject");

        image.setImageResource(id);
        name.setText(Name);
        date.setText(Date);
        Class.setText(classhs);

        lv1.setAdapter( new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, datasub));
    }
}