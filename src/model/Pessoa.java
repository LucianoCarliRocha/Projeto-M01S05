package model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Objects;


public abstract class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private Long cpf;
    private Long telefone;
    private int dataNascimento ;

    public Pessoa(String nome, Long cpf, Long telefone, int dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public Pessoa() {

    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                ", telefone=" + telefone +
                ", dataNascimento=" + dataNascimento +
                '}';
    }

    @Override
    public int compareTo(Pessoa o) {
        return this.getNome().compareTo(o.getNome());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa that = (Pessoa) o;
        return cpf == that.cpf && telefone == that.telefone && nome.equals(that.nome) && Objects.equals(dataNascimento,
                that.dataNascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, telefone, dataNascimento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
