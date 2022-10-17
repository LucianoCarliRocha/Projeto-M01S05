import Cli.Display;
import exception.OpcaoInvalidaException;
import model.*;
import repository.AlunoRepository;
import repository.PedagogoRepository;
import repository.ProfRepository;

import java.util.List;

public class Aplicacao {

    private Display display = new Display();
    private AlunoRepository repoAluno = new AlunoRepository();
    private ProfRepository repoProf = new ProfRepository();
    private PedagogoRepository repoPedagogo = new PedagogoRepository();

    public void executar() {
        Operacao operacao = null;

        while (operacao != Operacao.SAIR) {
            display.exibirMenu();
            try {
                operacao = display.obterOperacao();
                processar(operacao);
            } catch (OpcaoInvalidaException e) {
                display.exibirMensagem("Opção informada é inválida!");
            }
        }

    }

    private void processar(Operacao operacao) {
        switch (operacao) {
            case CADASTRAR_ALUNO:
                Aluno aluno = (Aluno) display.cadastrar(TipoPessoa.ALUNO);
                repoAluno.inserirAluno(aluno);
                break;
            case CADASTRAR_PROFESSOR:
                Professor professor = (Professor) display.cadastrar(TipoPessoa.PROFESSOR);
                repoProf.inserirProfessor( professor);
                break;
            case CADASTRAR_PEDAGOGO:
                Pedagogo pedagogo =(Pedagogo) display.cadastrar(TipoPessoa.PEDAGOGO);
                repoPedagogo.inserirPedagogo( pedagogo);

            case LISTAR_ALUNOS:
                List<Aluno> alunos = repoAluno.consultarAluno();
                if (alunos.isEmpty()) {
                    display.exibirMensagem("Sem alunos cadastrados");
                }
                display.listarAlunos(alunos);
                break;
        }
    }

}