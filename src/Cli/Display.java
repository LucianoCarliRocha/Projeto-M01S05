package Cli;

import exception.OpcaoInvalidaException;
import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Display {

    public void exibirMenu() {
        System.out.println();
        System.out.println("== MENU ==");
        System.out.println("1 - Cadastrar Aluno");
        System.out.println("2 - Cadastrar Professor");
        System.out.println("3 - Cadastrar Pedagogo");
        System.out.println("4 - Listar alunos");
        System.out.println("5 - Sair");
        System.out.println();
    }

    public Operacao obterOperacao() throws OpcaoInvalidaException {
        System.out.print("Digite a opção desejada: ");
        Scanner scanner = new Scanner(System.in);
        int codigoOpcao = scanner.nextInt();
        if (codigoOpcao < 0 || codigoOpcao > Operacao.values().length) {
            throw new OpcaoInvalidaException();
        }
        Operacao operacao = Operacao.obterPeloCodigo(codigoOpcao);
        return operacao;
    }

    public Pessoa cadastrar(TipoPessoa tipo) {

        Random codigo = new Random(999);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Telefone: ");
        Long telefone = scanner.nextLong();

        System.out.println("Data de nascimento: ");
        int dataNascimento = scanner.nextInt();

        System.out.println("CPF: ");
        long cpf = scanner.nextLong();

        System.out.println("Codigo: " + codigo);


        if (tipo == TipoPessoa.ALUNO) {
            Aluno aluno = new Aluno();
            System.out.println("Nota do processo seletivo de 0 a 10: ");
            double nota = scanner.nextDouble();
            System.out.println("Situacao: ");
            String situacao = scanner.nextLine();
            System.out.println("Qtd atendimentos: ");
            int atendimentos = scanner.nextInt();
            List<Aluno> dadosAlunos = new ArrayList<>();
            System.out.println(dadosAlunos);


            aluno = new Aluno(nome, cpf, telefone, dataNascimento, nota, atendimentos, situacao);

        }
        if (tipo == TipoPessoa.PROFESSOR) {

            System.out.print("Informe a formacao academica: ");
            String formacaoAcademica = scanner.nextLine();
            System.out.println("Esdado: ");
            String estado = scanner.nextLine();
            System.out.println("Experiencias: ");
            String experiencia = scanner.nextLine();
            //  pessoa = new Professor( nome, cpf, telefone, dataNascimento,
            //     formacaoAcademica,estado, experiencia);

            if (tipo == TipoPessoa.PEDAGOGO) {
                System.out.println();

            }
        }
        return null;
    }
        public void exibirMensagem (String msg){
            System.out.println(msg);
        }
        public void listarAlunos (List < Aluno > alunos) {
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        }
    }


