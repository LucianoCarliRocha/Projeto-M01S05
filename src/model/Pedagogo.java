package model;


public class Pedagogo extends Pessoa{
    Integer atendimentosPedagogicosRealizado=0;

    public Pedagogo(String nome, Long cpf, Long telefone, int dataNascimento,
                    Integer atendimentosPedagogicosRealizado) {
        super(nome, cpf, telefone, dataNascimento);
        this.atendimentosPedagogicosRealizado = atendimentosPedagogicosRealizado;
    }

    @Override
    public String toString() {
        return "Pedagogo{" +
                "atendimentosPedagogicosRealizado=" + atendimentosPedagogicosRealizado +
                '}';
    }

    public Integer getAtendimentosPedagogicosRealizado() {
        return atendimentosPedagogicosRealizado;
    }

    public void setAtendimentosPedagogicosRealizado(Integer atendimentosPedagogicosRealizado) {
        this.atendimentosPedagogicosRealizado = atendimentosPedagogicosRealizado;
    }
}
