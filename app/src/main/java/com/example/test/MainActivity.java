package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.sql.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_item);
    }
    int[] idImage = {R.drawable.lucas1, R.drawable.lucas2, R.drawable.lucas3,
    R.drawable.lucas4, R.drawable.lucas5};
    String[] name = {"Trung Tinh", "Thach Sang", "Le Dang Thuong", "Bui Cuong",
    "Le Khanh Duy"};
    String[] date = {"16/12/2003", "16/12/2003", "16/12/2003", "16/12/2003", "16/12/2003"};
    String[] Class = {"KTPM2021", "ATTT2021", "KHMT2021", "MMMTT2021", "CNTT2021"};

}