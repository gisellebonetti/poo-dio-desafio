package br.com.dio.desafio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {

    private String nome;
    private Set<Conteúdo> conteúdosInscritos = new LinkedHashSet<>();
    private Set<Conteúdo> conteúdosConcluidos = new LinkedHashSet<>();

    public void inscreverBootcamp (Bootcamp bootcamp) {
        this.conteúdosInscritos.addAll(bootcamp.getConteúdos());
        bootcamp.getDevsInscritos().add (this);
    }

    public void progredir () {
        Optional<Conteúdo> conteúdo = this.conteúdosInscritos.stream().findFirst();
        if(conteúdo.isPresent()) {
            this.conteúdosConcluidos.add(conteúdo.get());
            this.conteúdosInscritos.remove(conteúdo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calcularXp () {
        return this.conteúdosConcluidos
                .stream()
                .mapToDouble(conteúdo -> conteúdo.calcularXp())
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteúdo> getConteúdosInscritos() {
        return conteúdosInscritos;
    }

    public void setConteúdosInscritos(Set<Conteúdo> conteúdosInscritos) {
        this.conteúdosInscritos = conteúdosInscritos;
    }

    public Set<Conteúdo> getConteúdosConcluidos() {
        return conteúdosConcluidos;
    }

    public void setConteúdosConcluidos(Set<Conteúdo> conteúdosConcluidos) {
        this.conteúdosConcluidos = conteúdosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteúdosInscritos, dev.conteúdosInscritos) && Objects.equals(conteúdosConcluidos, dev.conteúdosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteúdosInscritos, conteúdosConcluidos);
    }
}
