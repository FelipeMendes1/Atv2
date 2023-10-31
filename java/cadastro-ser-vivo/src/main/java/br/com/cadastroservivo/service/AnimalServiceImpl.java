package br.com.cadastroservivo.service;

import br.com.cadastroservivo.model.Animal;

import java.util.List;
import java.util.Scanner;

public class AnimalServiceImpl implements AnimalService {

    Scanner scanner = new Scanner(System.in);

    public void createAnimal(List<Animal> animals) {
        Animal animal = new Animal();

        System.out.println("Digite o nome do animal: ");
        animal.setNome(this.scanner.nextLine());

        System.out.println("Digite a idade do animal: ");
        animal.setIdade(this.scanner.nextInt());
        this.scanner.nextLine();

        System.out.println("Digite o tipo do animal: ");
        animal.setTipo(this.scanner.nextLine());

        System.out.println("Digite a raça do animal: ");
        animal.setRaca(this.scanner.nextLine());

        System.out.println("Digite o porte do animal: ");
        animal.setPorte(this.scanner.nextLine());

        System.out.println("Digite a cor do animal: ");
        animal.setCor(this.scanner.nextLine());

        animal.emitirSom();
        animals.add(animal);
    }

    public void getAnimals(List<Animal> animals) {
        if (animals.isEmpty()){
            System.out.println("Não há animais cadastrados.");
        } else {
            for (Animal animal: animals) {
                System.out.println("Nome: " + animal.getNome());
                System.out.println("Idade: " + animal.getIdade());
                System.out.println("Tipo: " + animal.getTipo());
                System.out.println("Raça: " + animal.getRaca());
                System.out.println("Porte: " + animal.getPorte());
                System.out.println("Cor: " + animal.getCor());
                System.out.println("----------------");
            }
        }
    }

    public void removeAnimal(List<Animal> animals) {
        if (animals.isEmpty()){
            System.out.println("Não há animais cadastrados.");
        } else {
            System.out.println("Digite o nome do animal: ");
            String nome = this.scanner.nextLine();
            Animal animal = getAnimalByName(nome, animals);
            if (animal != null){
                animals.remove(animal);
                System.out.println("Animal removido com sucesso.");
            } else {
                System.out.println("Animal não encontrado.");
            }
        }
    }

    private Animal getAnimalByName(String nome, List<Animal> animals){
        for (Animal animal: animals) {
            if (animal.getNome().equals(nome)) {
                return animal;
            }
        }
        return null;
    }
}
