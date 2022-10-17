package repository;

import model.Aluno;
import java.util.ArrayList;
import java.util.List;

public class AlunoRepository {
    private List<Aluno> dadosAlunos = new ArrayList<>();
    public void inserirAluno(Aluno aluno) {
        dadosAlunos.add(aluno);
    }

    public List<Aluno> consultarAluno() {
        return dadosAlunos;
    }

}
