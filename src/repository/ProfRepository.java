package repository;

import model.Pessoa;
import model.Professor;

import java.util.ArrayList;
import java.util.List;

public class ProfRepository {
    private List<Professor> dadosProfessor = new ArrayList<>();
    public void inserirProfessor(Professor professor) {
        dadosProfessor.add(professor);
    }
}
