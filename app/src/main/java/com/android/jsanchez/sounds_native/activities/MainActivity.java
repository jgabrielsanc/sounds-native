package com.android.jsanchez.sounds_native.activities;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.android.jsanchez.sounds_native.Adapters.AnimalAdapter;
import com.android.jsanchez.sounds_native.R;
import com.android.jsanchez.sounds_native.modals.Animal;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ImageView imageViewPlay;
    private ImageView imageViewStop;
    private AnimalAdapter animalAdapter;
    private MediaPlayer mp;

    private List<Animal> animals;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.animals = getAllAnimals();

        this.listView = findViewById(R.id.listView);


        this.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                imageViewPlay = view.findViewById(R.id.imageViewPlay);
                imageViewStop = view.findViewById(R.id.imageViewStop);

                if (mp != null) {

                    mp.stop();
                    mp.release();
                    mp = null;
                    imageViewStop.setVisibility(View.GONE);
                    imageViewPlay.setVisibility(View.VISIBLE);
                    return;
                }

                mp = MediaPlayer.create(MainActivity.this, animals.get(i).getAudio());

                mp.start();


                imageViewPlay.setVisibility(View.GONE);
                imageViewStop.setVisibility(View.VISIBLE);

                new android.os.Handler().postDelayed(
                        new Runnable() {
                            public void run() {

                                if (mp != null) {

                                    mp.stop();
                                    mp.release();
                                    mp = null;
                                    imageViewStop.setVisibility(View.GONE);
                                    imageViewPlay.setVisibility(View.VISIBLE);
                                }
                            }
                        },
                        animals.get(i).getDuration() * 1000);
            }
        });

        this.animalAdapter = new AnimalAdapter(this, animals, R.layout.list_view_item_sound);

        this.listView.setAdapter(animalAdapter);
    }


    private List<Animal> getAllAnimals(){
        List<Animal> list = new ArrayList<>();

        list.add(new Animal("Caballo", R.mipmap.ic_caballo, R.raw.caballo, false, 4));
        list.add(new Animal("Cabra", R.mipmap.ic_cabra, R.raw.cabra, false, 4));
        list.add(new Animal("Cerdo", R.mipmap.ic_cerdo, R.raw.cerdo, false, 2));
        list.add(new Animal("Gallo", R.mipmap.ic_gallo, R.raw.gallo, false, 4));
        list.add(new Animal("Mono", R.mipmap.ic_mono, R.raw.mono, false, 4));
        list.add(new Animal("Perro", R.mipmap.ic_perro, R.raw.perro, false, 4));
        list.add(new Animal("Serpiente", R.mipmap.ic_serpiente, R.raw.serpiente, false, 2));
        list.add(new Animal("Tigre", R.mipmap.ic_tigre, R.raw.tigre, false, 2));

        return list;
    }
}
