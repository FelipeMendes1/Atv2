package br.com.cadastroservivo.service;

import br.com.cadastroservivo.model.Animal;

import java.util.List;

public interface AnimalService {
    void createAnimal(List<Animal> animals);
    void getAnimals(List<Animal> animals);
    void removeAnimal(List<Animal> animals);
}
