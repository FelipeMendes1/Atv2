#include <stdio.h>
#include <string.h>

// Caracteristica: O uso de Estruturas (structs) para agrupar dados relacionados em uma unica entidade.
// Definindo a estrutura para representar um animal

struct Animal {
   char nome[50];
   char tipo[50];
   char raca [50];
   char porte [50];
   char cor [50];
};


struct Animal lista_de_animais[100];
int num_animais = 0;

 // Caracteristica: Divisao do programa em funcoes separadas, cada uma delas com uma tarefa especifica, organizando o codigo.

void cadastrar_animal() {
   char nome[50];
   char tipo[50];
   char raca [50];
   char porte [50];
   char cor [50];

    printf("Digite o nome do animal: ");
    scanf("%s", nome);
    printf("Digite o tipo do animal: ");
    scanf("%s", tipo);
    printf("Digite a raça do animal: ");
    scanf("%s", raca);
    printf("Digite o porte do animal: ");
    scanf("%s", porte);
    printf("Digite a cor do animal: ");
    scanf("%s", cor);

    struct Animal animal;
    strcpy(animal.nome, nome);
    strcpy(animal.tipo, tipo);
    strcpy(animal.raca, raca);
    strcpy(animal.porte, porte);
    strcpy(animal.cor, cor);

    lista_de_animais[num_animais++] = animal;

    printf("\nAnimal cadastrado com sucesso!\n");
}

void visualizar_animais() {
    if (num_animais == 0) {
        printf("Não há animais cadastrados.\n");
    } else {
        printf("Animais cadastrados:\n");
        for (int i = 0; i < num_animais; i++) {
            printf("Nome: %s, Tipo: %s, Raça: %s, Porte: %s, Cor: %s\n", lista_de_animais[i].nome, lista_de_animais[i].tipo, lista_de_animais[i].raca, lista_de_animais[i].porte, lista_de_animais[i].cor);
        }
    }
}

void remover_animal() {
    char nome[50];

    printf("Digite o nome do animal que deseja remover: ");
    scanf("%s", nome);

    for (int i = 0; i < num_animais; i++) {
        if (strcmp(lista_de_animais[i].nome, nome) == 0) {
            for (int j = i; j < num_animais - 1; j++) {
                lista_de_animais[j] = lista_de_animais[j + 1];
            }
            num_animais--;
            printf("%s foi removido.\n", nome);
            return;
        }
    }
    printf("Animal com o nome %s não encontrado.\n", nome);
}

// Caracteristica: Uso de condicionais, ex. Uso de loops e uso de \n para exibir informacoes formatadas.

int main() {
    int escolha;

    while (1) {
        printf("Escolha uma opção:\n");
        printf("1. Cadastrar animal\n");
        printf("2. Visualizar animais\n");
        printf("3. Remover animal\n");
        printf("4. Sair\n");
        printf("Digite sua escolha: ");
        scanf("%d", &escolha);

        switch (escolha) {
            case 1:
                cadastrar_animal();
                break;
            case 2:
                visualizar_animais();
                break;
            case 3:
                remover_animal();
                break;
            case 4:
                return 0;
            default:
                printf("Opção inválida. Tente novamente.\n");
        }
    }

    return 0;
}
