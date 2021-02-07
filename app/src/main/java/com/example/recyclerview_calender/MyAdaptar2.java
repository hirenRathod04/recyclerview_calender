package com.example.recyclerview_calender;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdaptar2 extends RecyclerView.Adapter<MyAdaptar2.holder> {
    public MyAdaptar2(String[] data) {
        Data = data;
    }

    String Data[];
    @NonNull

    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from ( parent.getContext () );
        View view = inflater.inflate ( R.layout.row_list,parent,false );
       return  new holder ( view );
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
holder.textView.setText (Data[position]);
    }

    @Override
    public int getItemCount() {
        return Data.length;
    }

    class holder extends RecyclerView.ViewHolder{
            TextView textView;
        public holder(@NonNull View itemView) {
            super ( itemView );
            textView = (TextView)itemView.findViewById ( R.id.row_tv );

        }
    }
}
