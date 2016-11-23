package com.example.utilisateur.animaux;

/**
 * Created by Utilisateur on 23/11/2016.
 */

public class Animal {
    private String nomAnimal;
    private String famille;
    private String desc;
    private String image;

    public String getNomAnimal(){
        return nomAnimal;
    }

    public void setNomAnimal(String nomAnimal){
        this.nomAnimal=nomAnimal;
    }

    public String getFamille() {
        return famille;
    }

    public void setFamille(String famille) {
        this.famille = famille;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image)
    {
        this.image=image;
    }
}
