package com.example.aws.maindashboard;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {

    Context mContext;
    List<item> mData;
    int selected_position = 0 ;

    public MenuAdapter(Context mContext, List<item> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view = LayoutInflater.from(mContext).inflate(R.layout.item_layout,viewGroup,false);
       return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder menuViewHolder, int i) {

        menuViewHolder.imgIcon.setImageResource(mData.get(i).getIcon());
        menuViewHolder.imgIcon.setBackgroundColor(selected_position == i ? Color.parseColor("#fff1f1f1") :
                                                    Color.parseColor("#ffffff"));

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class MenuViewHolder extends RecyclerView.ViewHolder{

        ImageView imgIcon;

        public MenuViewHolder(@NonNull View itemView) {
            super(itemView);
            imgIcon = itemView.findViewById(R.id.img_icon) ;
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    notifyItemChanged(selected_position);
                    selected_position = getAdapterPosition();
                    notifyItemChanged(selected_position);
                }
            });
        }
    }
}
