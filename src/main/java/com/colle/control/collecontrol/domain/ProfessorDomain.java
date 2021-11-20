package com.colle.control.collecontrol.domain;

import java.math.BigDecimal;
import java.util.Scanner;

public class ProfessorDomain extends PessoaJuridicaDomain implements ICadastroDomain {

    private String formacao;

    private String materiaLecionada;

    private Boolean professorStatus;

    private Integer matricula;

    private BigDecimal salario;

    public ProfessorDomain() {
        this.cadastro();
    }

    public String getFormacao() {
        return formacao;
    }

    public String getMateriaLecionada() {
        return materiaLecionada;
    }

    public Boolean getProfessorStatus() {
        return professorStatus;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    @Override
    public void cadastro() {
        super.cadastro();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a formação do professor");
        this.formacao = leitor.nextLine();

        System.out.println("Digite a materia lecionada pelo professor!");
        this.materiaLecionada = leitor.nextLine();

        System.out.println("Digite se o professor esta ativo");
        this.professorStatus = super.ativo(leitor.nextLine());

        System.out.println("Digite a matricula do professor!");
        this.matricula = leitor.nextInt();

        System.out.println("Digite o salario do professor!");
        this.salario = leitor.nextBigDecimal();

    }
}
