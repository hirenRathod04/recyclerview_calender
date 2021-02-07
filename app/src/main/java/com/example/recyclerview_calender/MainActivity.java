package com.example.recyclerview_calender;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        RecyclerView recyclerView = findViewById ( R.id.rv_data );
        recyclerView.setLayoutManager ( new LinearLayoutManager ( this ) );
        String arr[] = {"hiren","vishal","1","2","3","4","hiren","vishal","1","2","3","4","hiren","vishal","1","2","3","4"};
        recyclerView.setAdapter ( new MyAdapter ( arr ) );

    }
}