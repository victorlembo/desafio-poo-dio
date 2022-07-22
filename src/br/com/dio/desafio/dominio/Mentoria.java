/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dio.desafio.dominio;

import java.time.LocalDate;

/**
 *
 * @author Victor Hugo
 */
public class Mentoria extends Conteudo {

    private LocalDate data;

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20;

    }

    @Override
    public String toString() {
        return "Mentoria{"
                + "titulo = " + getTitulo()
                + ", descricao = " + getDescricao()
                + ", data = " + getData()
                + '}';
    }

}
