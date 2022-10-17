package model;

public enum Operacao {

    CADASTRAR_ALUNO,
    CADASTRAR_PROFESSOR,
    CADASTRAR_PEDAGOGO,
    LISTAR_ALUNOS,
    SAIR;

    public static Operacao obterPeloCodigo(int codigo) {
        Operacao[] operacoes = Operacao.values();
        return operacoes[codigo-1];
    }

}