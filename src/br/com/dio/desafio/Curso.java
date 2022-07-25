package br.com.dio.desafio;

public class Curso extends Conteúdo{
    private int cargaHoraria;

    @Override
    public double calcularXp(){
        return XP_PADRAO * cargaHoraria;
    }

    public Curso() {
    }


    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
