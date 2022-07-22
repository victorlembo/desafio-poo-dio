
import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Victor Hugo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Curso c1 = new Curso();
        c1.setTitulo("Curso Java");
        c1.setDescricao("Descricao Curso Java");
        c1.setCargaHoraria(8);

        Curso c2 = new Curso();
        c2.setTitulo("Curso JavaScript");
        c2.setDescricao("Descricao Curso JS");
        c2.setCargaHoraria(8);

        Conteudo cnt1 = new Curso();
        Conteudo cnt2 = new Mentoria();

        Mentoria m1 = new Mentoria();
        m1.setTitulo("Mentoria de Java");
        m1.setDescricao("Mentoria Java");
        m1.setData(LocalDate.now());

        Mentoria m2 = new Mentoria();
        m2.setTitulo("Mentoria de JS");
        m2.setDescricao("Mentoria JavaScript");
        m2.setData(LocalDate.now());

        Bootcamp bc = new Bootcamp();
        bc.setNome("Java Developer");
        bc.setDescricao("Descricao Bootcamp Java Developer");
        bc.getConteudos().add(c1);
        bc.getConteudos().add(m1);

        Dev dv1 = new Dev();
        dv1.setNome("Joao");
        dv1.inscreverBootcamp(bc);
        System.out.println("Conteudos Inscritos " + dv1.getNome() + " " + dv1.getConteudosInscritos());
        dv1.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos " + dv1.getNome() + " " + dv1.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + dv1.getNome() + " " + dv1.getConteudosConcluidos());
        System.out.println("XP: " + dv1.calcularTotalXp());
        
        System.out.println("---------");

        Dev dv2 = new Dev();
        dv2.setNome("Maria");
        dv2.inscreverBootcamp(bc);
        System.out.println("Conteudos Inscritos " + dv2.getNome() + " " + dv2.getConteudosInscritos());
        dv2.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos " + dv2.getNome() + " " + dv2.getConteudosInscritos());
        System.out.println("Conteudos Concluidos " + dv2.getNome() + " " + dv2.getConteudosConcluidos());
        System.out.println("XP: " + dv2.calcularTotalXp());
    }

}
