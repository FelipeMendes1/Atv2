package br.com.cadastroservivo.service;

import br.com.cadastroservivo.model.Humano;

import java.util.List;
import java.util.Scanner;

public class HumanoServiceImpl implements HumanoService {
    Scanner scanner = new Scanner(System.in);

    public void createHumano(List<Humano> humanos) {
        Humano humano = new Humano();

        System.out.println("Digite o nome do humano: ");
        humano.setNome(this.scanner.nextLine());

        System.out.println("Digite a idade do humano: ");
        humano.setIdade(this.scanner.nextInt());
        this.scanner.nextLine();

        System.out.println("Digite o CPF do humano: ");
        humano.setCpf(this.scanner.nextLine());

        humano.emitirSom();
        humanos.add(humano);
    }

    public void getHumanos(List<Humano> humanos) {
        if (humanos.isEmpty()){
            System.out.println("Não há humanos cadastrados.");
        } else {
            for (Humano humano: humanos) {
                System.out.println("Nome: " + humano.getNome());
                System.out.println("Idade: " + humano.getIdade());
                System.out.println("Tipo: " + humano.getCpf());
                System.out.println("----------------");
            }
        }
    }

    public void removeHumano(List<Humano> humanos) {
        if (humanos.isEmpty()){
            System.out.println("Não há humanos cadastrados.");
        } else {
            System.out.println("Digite o nome do humano: ");
            String nome = this.scanner.nextLine();
            Humano humano = getHumanoByName(nome, humanos);
            if (humano != null){
                humanos.remove(humano);
                System.out.println("Humano removido com sucesso.");
            } else {
                System.out.println("Humano não encontrado.");
            }
        }
    }

    private Humano getHumanoByName(String nome, List<Humano> humanos){
        for (Humano humano: humanos) {
            if (humano.getNome().equals(nome)) {
                return humano;
            }
        }
        return null;
    }
}
