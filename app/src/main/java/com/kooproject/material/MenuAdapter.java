package com.kooproject.material;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {

    public interface OnItemClickListener {
        void onItemClick(View view, int position, String menuname);
    }

    private ArrayList<String> arr_menu = null;
    private OnItemClickListener mListener = null;

    public void setOnItemClickListener(OnItemClickListener listener){
        this.mListener = listener;
    }

    MenuAdapter(ArrayList<String> list){
        arr_menu = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.main_recycler_item,parent,false);
        MenuAdapter.ViewHolder vh = new MenuAdapter.ViewHolder(view);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String menu = arr_menu.get(position);
        holder.tv_item.setText(menu);
    }

    @Override
    public int getItemCount() {
        return arr_menu.size();
    }

    public  class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_item;

        ViewHolder(final View itemView) {
            super(itemView);
            tv_item = (TextView) itemView.findViewById(R.id.tv_item);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    if(position != RecyclerView.NO_POSITION){
                        if(mListener != null){
                            String menu = arr_menu.get(position);
                            mListener.onItemClick(v,position,menu);

                        }
                    }
                }
            });
        }
    }
}
