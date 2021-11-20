package com.colle.control.collecontrol.service;

import com.colle.control.collecontrol.domain.AlunoDomain;
import com.colle.control.collecontrol.domain.FornecedorDomain;
import com.colle.control.collecontrol.domain.ProfessorDomain;

import java.util.InputMismatchException;
import java.util.Scanner;

import static com.colle.control.collecontrol.enums.MenuOpcoes.getOpcao;
import static com.colle.control.collecontrol.enums.MenuOpcoes.printMenu;

public class CadastroService {

    private AlunoService alunoService;

    private FornecedorService fornecedorService;

    private ProfessorService professorService;

    public CadastroService() {
        this.alunoService = new AlunoService();
        this.fornecedorService = new FornecedorService();
        this.professorService = new ProfessorService();
    }

    public void funcionalidadeMenu() {
        printMenu();
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        while (option != 0) {
            System.out.println("*************** Seja Bem Vindo!!! ***************");
            switch (getOpcao(option)) {
                case CADASTRO_ALUNO:
                    this.alunoService.inserir(new AlunoDomain());
                    break;
                case CADASTRO_FORNECEDOR:
                    this.fornecedorService.inserir(new FornecedorDomain());
                    break;
                case CADASTRO_PROFESSOR:
                    this.professorService.inserir(new ProfessorDomain());
                    break;
                default:
                    printMenu();
                    option = scanner.nextInt();
                    break;
            }
            try {
                option = scanner.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Por favor, digite um valor valido.");
                scanner.next();
            } catch (Exception ex) {
                System.out.println("Erro inesperado.");
                scanner.next();
            }
        }
    }
}
