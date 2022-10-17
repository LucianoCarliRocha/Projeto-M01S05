package repository;

import model.Aluno;
import model.Pedagogo;
import model.Professor;

import java.util.ArrayList;
import java.util.List;

public class PersonagemRepository {

    private List<Aluno> dadosAlunos = new ArrayList<>();
    public void inserirAluno(Aluno aluno) {
        dadosAlunos.add(aluno);
    }

    public List<Aluno> consultarAluno() {
        return dadosAlunos;
    }
    private List<Professor> dadosProfessor = new ArrayList<>();
    public void inserirProfessor(Professor professor) {
        dadosProfessor.add(professor);
    }
    private List<Pedagogo> dadosPedagogos = new ArrayList<>();
    public void inserirPedagogo(Pedagogo pedagogo) {
        dadosPedagogos.add(pedagogo);
    }

}
