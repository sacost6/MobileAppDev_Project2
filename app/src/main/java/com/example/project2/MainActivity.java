package com.example.project2;

import android.media.Image;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int image[] = {R.drawable.nissanskyline, R.drawable.hellcat, R.drawable.foxbodymustang,
            R.drawable.c4corvette, R.drawable.rollsroyceseries2, R.drawable.mclaren600lt,
            R.drawable.hvipergt, R.drawable.chargergt, R.drawable.fourrunner,
            R.drawable.audiquattro, R.drawable.mclarenf1, R.drawable.citroends};

    GridView gridView;
    ArrayList<ImageModel> arrayList;
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = (GridView) findViewById(R.id.gridview);
        arrayList = new ArrayList<>();
        for (int i = 0; i < image.length; i++) {
            ImageModel imagemodel = new ImageModel();
            imagemodel.setmThumbIds(image[i]);
            //add in array list
            arrayList.add(imagemodel);
        }

        final ImageAdapter adpter= new ImageAdapter(getApplicationContext(), arrayList);
        gridView.setAdapter(adpter);
        //item click listner
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                System.out.println("position clicked is" + position);
            }
        });
    }
}