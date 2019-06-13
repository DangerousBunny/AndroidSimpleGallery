package com.example.androidsimplegallery;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.os.AsyncTask;
import android.os.Environment;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private int [] images = {R.drawable.baseball , R.drawable.pic2, R.drawable.pic3,
            R.drawable.cdifurniture, R.drawable.hope,R.drawable.fire,
            R.drawable.james, R.drawable.kawsdarthvader, R.drawable.keith,
            R.drawable.kawsrobot, R.drawable.keithharing, R.drawable.kawswood,
            R.drawable.kyrie, R.drawable.lebron, R.drawable.mary, R.drawable.palace,
            R.drawable.photobasel, R.drawable.pic1, R.drawable.pic4, R.drawable.pic6,
            R.drawable.pic7, R.drawable.pic8, R.drawable.pic9, R.drawable.pic10,R.drawable.pubg,
            R.drawable.pubgintel, R.drawable.resist, R.drawable.rundmc, R.drawable.skateboard,
            R.drawable.visionnare};
   private RecyclerAdapter adapter;

    private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerAdapter(images);
        recyclerView.setAdapter(adapter);

    }
//Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES)+”/Basic”

   // AsyncTask.execute(new Runnable {
    //  public void run() {
    //     splash.setImageResource(R.drawable.square);
    //  }
    //});
}
