package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;


public class Aluno extends Pessoa { //<<<<<<<ALuno

    private double nota = 0;
    private int atendimentosAluno=0;
    private String situacao;


    public Aluno(String nome, Long cpf, Long telefone, int dataNascimento, double nota,
                 int atendimentosAluno, String situacao) {
        super(nome, cpf, telefone, dataNascimento);
        this.nota = nota;
        this.atendimentosAluno = atendimentosAluno;
        this.situacao = situacao;
    }

    public Aluno() {
        super();
    }

    @Override
    public String toString() {
        return "Aluno " +
                "nota= " + nota +
                ", atendimentosAluno= " + atendimentosAluno +
                ", situacaoAluno='" + situacao + '\'' ;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getAtendimentosAluno() {
        return atendimentosAluno;
    }

    public void setAtendimentosAluno(int atendimentosAluno) {
        this.atendimentosAluno = atendimentosAluno;
    }

    public String getSituacaoAluno() {
        return situacao;
    }

    public void setSituacaoAluno(String situacaoAluno) {
        this.situacao = situacaoAluno;
    }
}