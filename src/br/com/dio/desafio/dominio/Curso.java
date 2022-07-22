/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dio.desafio.dominio;

/**
 *
 * @author Victor Hugo
 */
public class Curso extends Conteudo {

    private int cargaHoraria;

    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * getCargaHoraria();

    }

    @Override
    public String toString() {
        return "Mentoria{"
                + "titulo = " + getTitulo()
                + ", descricao = " + getDescricao()
                + ", carga horaria = " + getCargaHoraria()
                + '}';
    }

}
