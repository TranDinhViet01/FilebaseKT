package com.example.demofire;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityListThuoc extends AppCompatActivity {
    ListView lv;
    ArrayList<Thuoc> ArrayTruyen;
    AdapterThuoc adapter;
    EditText truyen;
    Button Back;
    Button Add;
    Button AddTruyen;
    int stop = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_thuoc);
    }
}