package com.ecomida.model;

public class CategoriaCardModel {

    private int image;
    private String titulo;

    public CategoriaCardModel(int image, String titulo) {
        this.image = image;
        this.titulo = titulo;
    }

    public int getImage() {
        return image;
    }

    public String getTitulo() {
        return titulo;
    }

}
