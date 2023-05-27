package com.example.learnbasicandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lvTraiCay;
    ArrayList<TraiCay> dsTraiCay;
    TraiCayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnhXa();
        adapter = new TraiCayAdapter(this,R.layout.dong_trai_cay,dsTraiCay);
        lvTraiCay.setAdapter(adapter);
    }
    private void AnhXa(){
        lvTraiCay = (ListView) findViewById(R.id.listViewTraiCay);
        dsTraiCay = new ArrayList<>();
        dsTraiCay.add(new TraiCay("Dâu tây","Dâu tây Đà Lạt",R.drawable.dautay));
        dsTraiCay.add(new TraiCay("Dưa hấu","Dưa hấu ngọt",R.drawable.duahau));
        dsTraiCay.add(new TraiCay("Xoài","Xoài Thái",R.drawable.xoai));
    }
}