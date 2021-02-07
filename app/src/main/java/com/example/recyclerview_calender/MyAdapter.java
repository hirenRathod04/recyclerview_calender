package com.example.recyclerview_calender;

import android.graphics.Color;
import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.holder> {//1 and 5 alt + ent

    String data[];//2 and 3 generate gatter setter

    public MyAdapter(String[] data) {//3
        this.data = data;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {//6
        LayoutInflater inflater = LayoutInflater.from ( parent.getContext () );
        View view = inflater.inflate ( R.layout.row_list,parent,false );
        return new holder ( view );
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {//7


if ( position == 0 )
    { data[0] = "ankita";
      holder.textView.setBackgroundColor( Color.parseColor("#FFBB86FC"));
      holder.textView.setTextColor(Color.parseColor("#FF000000"));//updating the value
         }
        holder.textView.setText ( data[position] );
    }

    @Override
    public int getItemCount() {//8
        return data.length;
    }

    class holder extends  RecyclerView.ViewHolder{//4
            TextView textView;
       public holder(@NonNull View itemView) {
           super ( itemView );
           textView = itemView.findViewById ( R.id.row_tv );//rowxml

       }
   }
}
