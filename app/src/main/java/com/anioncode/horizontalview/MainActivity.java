package com.anioncode.horizontalview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        String [] Name=new String[]{"McRoyal","McBurger","burger3","burger4"};
        String [] Price=new String[]{"4.00$","14.00$","2.00$","4.50$"};
        Drawable[] Burger=new Drawable[]{getDrawable(R.drawable.burger1),getDrawable(R.drawable.burger2),getDrawable(R.drawable.burger3),getDrawable(R.drawable.burger4)};
        recyclerView.setAdapter(new HorizontalAdapter(Name,Price,Burger));
    }
}
