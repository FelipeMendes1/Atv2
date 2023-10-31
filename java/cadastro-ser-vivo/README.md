# Cadastro de Seres Vivos (Humanos e Animais)

Projeto simples de cadastro para a disciplina de Paradigmas de Linguagens de Programação 
com a finalidade de destacar os pilares do paradigma Orientado a Objetos

Pilares da Orientação a Objetos e onde encontrar no código:

1. **Abstração**: interfaces para classes de serviço (AnimalService e HumanoService)
2. **Encapsulamento**: getters, setters e atributos privados nas classes modelos (SerVivo, Animal e Humano)
3. **Herança**: 
   1. Classe pai: SerVivo
   2. Classes filhas: Humano e Animal
4. **Polimorfismo**: na classe pai (SerVivo) há o método emitirSom que tem implementações diferentes nas classes filhas.