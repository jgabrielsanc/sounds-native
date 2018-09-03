package com.android.jsanchez.sounds_native.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.jsanchez.sounds_native.R;
import com.android.jsanchez.sounds_native.modals.Animal;

import java.util.List;
import java.util.zip.Inflater;

public class AnimalAdapter extends BaseAdapter {

    private Context context;
    private List<Animal> animals;
    private int layout;

    public AnimalAdapter(Context context, List<Animal> animals, int layout) {
        this.context = context;
        this.animals = animals;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return this.animals.size();
    }

    @Override
    public Animal getItem(int i) {
        return this.animals.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ViewHolder holder;

        if (view == null){

          view = LayoutInflater.from(this.context).inflate(layout, null);

          holder = new ViewHolder();
            {
                holder.name = view.findViewById(R.id.textView);
                holder.iconAnimal = view.findViewById(R.id.imageViewIcon);
            }

            view.setTag(holder);

        } else {
            holder = (ViewHolder) view.getTag();
        }

        final Animal currentAnimal = getItem(i);

        holder.name.setText(currentAnimal.getName());
        holder.iconAnimal.setImageResource(currentAnimal.getIcon());

        return view;
    }

    static class ViewHolder{
        private TextView name;
        private ImageView iconAnimal;
    }
}

