package com.example.utilisateur.animaux;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Animal> mesAnimaux;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Listes des animaux
        mesAnimaux = new ArrayList<Animal>();
        initList(mesAnimaux);

        RecyclerView rView = (RecyclerView) findViewById(R.id.recyclerview);


        //Instanciation LinearLayout Manager
        LinearLayoutManager monManager = new LinearLayoutManager(this);

        rView.setLayoutManager(monManager);

        final Adapter monAdapter = new Adapter(mesAnimaux);

        rView.setAdapter(monAdapter);
    }

    public void initList(ArrayList<Animal> list) {
        Animal a1 = new Animal();
        a1.setNomAnimal("jars");
        a1.setFamille("oiseau");
        a1.setDesc("valeureux");
        a1.setImage("jars");
        list.add(a1);
        Animal a2 = new Animal();
        a2.setNomAnimal("panda");
        a2.setFamille("mammifère");
        a2.setDesc("noir et blanc");
        a2.setImage("panda");
        list.add(a2);
        Animal a3 = new Animal();
        a3.setNomAnimal("cobra");
        a3.setFamille("reptile");
        a3.setDesc("dangereux");
        a3.setImage("cobra");
        list.add(a3);
        Animal a4 = new Animal();
        a4.setNomAnimal("coelacanthe");
        a4.setFamille("poisson");
        a4.setDesc("vieux");
        a4.setImage("coelacanthe");
        list.add(a4);
        Animal a5 = new Animal();
        a5.setNomAnimal("gnou");
        a5.setFamille("mammifère");
        a5.setDesc("bah c'est un gnou quoi");
        a5.setImage("gnou");
        list.add(a5);
        Animal a6 = new Animal();
        a6.setNomAnimal("ornithorynque");
        a6.setFamille("mammifère");
        a6.setDesc("pond des oeufs");
        a6.setImage("ornithorynque");
        list.add(a6);
        Animal a7 = new Animal();
        a7.setNomAnimal("homme");
        a7.setFamille("mammifère");
        a7.setDesc("c'est jean-michel");
        a7.setImage("homme");
        list.add(a7);
        Animal a8 = new Animal();
        a8.setNomAnimal("pigeon");
        a8.setFamille("oiseau");
        a8.setDesc("ils sont partout");
        a8.setImage("pigeon");
        list.add(a8);
    }
}
