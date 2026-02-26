package com.gestordenotasdealunos.entity;

public class Aluno {
    private String nome;
    private int idade;
    private int[] notas;

    public Aluno(String nome, int idade, int[] notas){
        this.nome = nome;
        this.idade = idade;
        this.notas = notas;

    }

    public Aluno() {

    }

    public int getIdade() {
        return idade;
    }

    public int[] getNotas() {
        return notas;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }
}

