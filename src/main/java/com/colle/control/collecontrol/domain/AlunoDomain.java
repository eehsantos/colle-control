package com.colle.control.collecontrol.domain;

import java.util.Scanner;

public class AlunoDomain extends PessoaFisicaDomain implements ICadastroDomain {

    private String formacao;

    private String cursoCursando;

    private boolean alunoStatus;

    private int matricula;

    public AlunoDomain() {
        this.cadastro();
    }

    public String getFormacao() {
        return formacao;
    }

    public String getCursoCursando() {
        return cursoCursando;
    }

    public boolean isAlunoStatus() {
        return alunoStatus;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public void cadastro() {
        super.cadastro();

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a Formação do Aluno!");
        this.formacao = leitor.nextLine();

        System.out.println("Digite qual curso o Aluno esta cursando: ");
        this.cursoCursando = leitor.nextLine();

        System.out.println("Digite AT se o aluno estiver ativo ou NA para não ativo: ");
        this.alunoStatus = super.ativo(leitor.nextLine());

        System.out.println("Informe a Matricula do Aluno: ");
        this.matricula = leitor.nextInt();
    }
}
