package com.example.utilisateur.animaux;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private ArrayList<Animal> animalList;

    private Resources res;
    private Context context;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        //Instantiation des données de l'interface de chaque element de la liste
        public TextView nomAnimal;
        public TextView famille;
        public ImageView img;
        public TextView desc;

        //Constructeur du ViewHolder
        public ViewHolder(View view) {
            super(view);
            nomAnimal = (TextView) view.findViewById(R.id.animal);
            famille = (TextView) view.findViewById(R.id.famille);
            img = (ImageView) view.findViewById(R.id.imageView);
            desc = (TextView) view.findViewById(R.id.description);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Récuperation des ressources pour les images
        this.res = parent.getContext().getResources();
        //ainsi que du context
        this.context = parent.getContext();

        View v = LayoutInflater.from(context).inflate(R.layout.detail,parent,false);

        //Création du viewHolder
        ViewHolder vh = new ViewHolder(v);

        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final Animal anim = animalList.get(position);
        holder.desc.setText(anim.getDesc());
        holder.nomAnimal.setText(anim.getNomAnimal());
        holder.famille.setText(anim.getFamille());
        holder.img.setImageResource(res.getIdentifier(anim.getImage() , "drawable", context.getPackageName()));
    }

    //Constructeur de la classe Adapter
    public Adapter(ArrayList<Animal> anim)
    {
        animalList = anim;
    }

    //Fonction qui retourne la taille de mon "DataSet"
    @Override
    public int getItemCount() {
        return animalList.size();
    }






}