package com.colle.control.collecontrol.domain;

import java.time.LocalDate;
import java.util.Scanner;

public class PessoaFisicaDomain extends PessoaDomain implements IValidacaoDomain<PessoaFisicaDomain>, ICadastroDomain{

    private String sobreNome;

    private String cpf;

    private String dataNascimento;

    public String getSobreNome() {
        return sobreNome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public Boolean validarChave(PessoaFisicaDomain domain) {
        return null;
    }

    @Override
    public void cadastro() {
        super.cadastro();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o Sobrenome!");
        this.sobreNome = leitor.nextLine();

        System.out.println("Digite o CPF!");
        this.cpf = leitor.nextLine();

        System.out.println("Digite a data de nascimento!");
        this.dataNascimento = leitor.nextLine();
    }
}
