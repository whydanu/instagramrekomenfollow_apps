package com.example.instagramfollowclone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity {
    //inisiasi
    AdapterClass adapterClass;
    ViewPager2 pager2;
    int list[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pager2 = findViewById(R.id.view_pager2);

        list = new int [5];
        list [0] = R.drawable.satu;
        list [1] = R.drawable.dua;
        list [2] = R.drawable.tiga;
        list [3] = R.drawable.empat;
        list [4] = R.drawable.satu;

        adapterClass = new AdapterClass(list);
        pager2.setAdapter(adapterClass);
 
        pager2.setClipToPadding(false);
        pager2.setClipChildren(false);
        pager2.setOffscreenPageLimit(4);

        CompositePageTransformer transformer = new CompositePageTransformer();
        transformer.addTransformer(new ViewPager2.PageTransformer() {
            @Override
            public void transformPage(@NonNull @NotNull View page, float position) {

                float a =1- Math.abs(position);
                page.setScaleY(0.85f + a*0.15f);
            }
        });

        pager2.setPageTransformer(transformer);

    }
}