package br.com.cadastroservivo;

import br.com.cadastroservivo.model.Animal;
import br.com.cadastroservivo.model.Humano;
import br.com.cadastroservivo.service.AnimalService;
import br.com.cadastroservivo.service.AnimalServiceImpl;
import br.com.cadastroservivo.service.HumanoService;
import br.com.cadastroservivo.service.HumanoServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 List<Animal> animals = new ArrayList<>();
		 List<Humano> humanos = new ArrayList<>();
		 AnimalService animalService = new AnimalServiceImpl();
		 HumanoService humanoService = new HumanoServiceImpl();
		 int option;

		 do {
			 System.out.println("\nMenu:");
			 System.out.println("1. Cadastrar Animal");
			 System.out.println("2. Visualizar Animais");
			 System.out.println("3. Remover Animal");
			 System.out.println("4. Cadastrar Humano");
			 System.out.println("5. Visualizar Humanos");
			 System.out.println("6. Remover Humano");
			 System.out.println("0. Sair");

			 option = scanner.nextInt();

			 switch (option){
				 case 0:
					 break;
				 case 1:
					 animalService.createAnimal(animals);
					 break;
				 case 2:
					 animalService.getAnimals(animals);
					 break;
				 case 3:
					 animalService.removeAnimal(animals);
					 break;
				 case 4:
					 humanoService.createHumano(humanos);
					 break;
				 case 5:
					 humanoService.getHumanos(humanos);
					 break;
				 case 6:
					 humanoService.removeHumano(humanos);
					 break;
				 default:
					 System.out.println("Opção inválida, digite outra.");
					 break;
			 }
		 } while (option != 0);
	 }
}
