lista = [8, 4, 5, 1, 9, 3, 2, 6]

def bubble_sort(lista: list):
    tamanho = len(lista)
    temp = 0
     
    for i in range(0, tamanho - 1):
        for j in range(0, tamanho - 1):
            if lista[j] > lista[j + 1]:
                temp = lista[j]
                lista[j] = lista[j + 1]
                lista[j + 1] = temp

    return lista

print(bubble_sort(lista))