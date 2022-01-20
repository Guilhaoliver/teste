package com.senac.models;

import lombok.Data;

import java.util.Comparator;

@Data
public class Aplicativo {

    private String nome;
    private double tempo;
    private String icone;

    public Aplicativo(String nome, double tempo, String icone) {
        this.nome = nome;
        this.tempo = tempo;
        this.icone = icone;


    }
}
