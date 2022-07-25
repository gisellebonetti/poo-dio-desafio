import br.com.dio.desafio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String [] args){
        Curso curso1 = new Curso ();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria ();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Code Girls");
        bootcamp.setDescricao("Descrição Bootcamp Code Girls");
        bootcamp.getConteúdos().add(curso1);
        bootcamp.getConteúdos().add(curso2);
        bootcamp.getConteúdos().add(mentoria);

        Dev devGiselle = new Dev();
        devGiselle.setNome("Giselle");
        devGiselle.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Giselle" + devGiselle.getConteúdosInscritos());
        devGiselle.progredir();
        devGiselle.progredir();
        devGiselle.progredir();
        System.out.println("-");

        System.out.println("Conteúdos inscritos de Giselle" + devGiselle.getConteúdosInscritos());
        System.out.println("Conteúdos concluídos de Giselle" + devGiselle.getConteúdosInscritos());
        System.out.println("XP: " + devGiselle.calcularXp());

        System.out.println("-------------");

        Dev devGustavo = new Dev();
        devGustavo.setNome("Gustavo");
        devGustavo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos de Gustavo" + devGustavo.getConteúdosInscritos());
        devGustavo.progredir();
        devGustavo.progredir();
        System.out.println("-");

        System.out.println("Conteúdos inscritos de Gustavo" + devGustavo.getConteúdosInscritos());
        System.out.println("Conteúdos concluídos de Gustavo" + devGustavo.getConteúdosInscritos());
        System.out.println("XP: " + devGustavo.calcularXp());

    }
}
