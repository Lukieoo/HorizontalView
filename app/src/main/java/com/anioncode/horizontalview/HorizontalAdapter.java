package com.anioncode.horizontalview;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.HorizontalViewHolder>{

    private String[] items;
    private String[] prices;
    private Drawable[] drawables;

    public HorizontalAdapter(String[] items, String[] prices, Drawable[] drawables) {
        this.items = items;
        this.prices = prices;
        this.drawables = drawables;
    }

    @NonNull
    @Override
    public HorizontalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.item_layout,parent,false);

        return new HorizontalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalViewHolder holder, int position) {

        holder.burgerphoto.setBackground(drawables[position]);
        holder.burgername.setText(items[position]);
        holder.burgerprice.setText(prices[position]);

    }

    @Override
    public int getItemCount() {
        return items.length;
    }

    public class HorizontalViewHolder extends RecyclerView.ViewHolder{

        View burgerphoto;
        TextView burgername;
        TextView burgerprice;

        public HorizontalViewHolder(@NonNull View itemView) {
            super(itemView);

            burgerphoto=itemView.findViewById(R.id.burgerphoto);
            burgername=itemView.findViewById(R.id.burgername);
            burgerprice=itemView.findViewById(R.id.burgerprice);

        }
    }
}
