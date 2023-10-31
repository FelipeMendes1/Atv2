def cadastrar_animal():
    nome = input("Digite o nome do animal: ")
    tipo = input("Digite o tipo do animal: ")
    raca = input("Digite a raça do animal: ")
    porte = input("Digite o porte do animal: ")
    cor = input("Digite a cor do animal: ")
    animal = {"Nome": nome, "Tipo": tipo, "Raça": raca, "Porte": porte, "Cor": cor}
    lista_de_animais.append(animal)
    print("Animal cadastrado com sucesso!")

def visualizar_animais():
    if not lista_de_animais:
        print("Não há animais cadastrados.")
    else:
        for animal in lista_de_animais:
            print(f"Nome: {animal['Nome']}, Tipo: {animal['Tipo']}, Raça: {animal['Raça']}, Porte: {animal['Porte']}, Cor: {animal['Cor']}")

def remover_animal():
    nome = input("Digite o nome do animal que deseja remover: ")
    for animal in lista_de_animais:
        if animal['Nome'] == nome:
            lista_de_animais.remove(animal)
            print(f"{nome} foi removido.")
            return
    print(f"Animal com o nome {nome} não encontrado.")

lista_de_animais = []

while True:
    print("\nMenu:")
    print("1. Cadastrar Animal")
    print("2. Visualizar Animais")
    print("3. Remover Animal")
    print("4. Sair")
    
    escolha = input("Escolha uma opção: ")
    
    if escolha == '1':
        cadastrar_animal()
    elif escolha == '2':
        visualizar_animais()
    elif escolha == '3':
        remover_animal()
    elif escolha == '4':
        break
    else:
        print("Opção inválida. Tente novamente.")
