package com.leandromuzalski1843.tableviewvideojuegos.videojuegos;

import java.time.LocalDateTime;
import java.util.List;

public class videoJuego {
    private final int id;
    private final String titulo;
    private final String compañiaDesarrolladora;
    private final List<String> generos;
    private final int anioLanzamiento;

    public videoJuego(int id, String titulo, String compañiaDesarrolladora, List<String> generos, int anioLanzamiento) {
        this.id = id;
        this.titulo = titulo;
        this.compañiaDesarrolladora = compañiaDesarrolladora;
        this.generos = generos;
        this.anioLanzamiento = anioLanzamiento;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCompañiaDesarrolladora() {
        return compañiaDesarrolladora;
    }

    public List<String> getGeneros() {
        return generos;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }
}
