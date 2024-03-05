lista = [8, 4, 5, 1, 9, 3, 2, 6, 12, 5, 2, 1]

def selection_sort(lista: list):
    tamanho = len(lista)
    

    for i in range(0, tamanho - 1):
        min_index = i
        for j in range(i + 1, tamanho):
            if lista[j] < lista[min_index]:
                min_index = j
        if lista[i] > lista[min_index]:
            aux = lista[i]
            lista[i] = lista[min_index]
            lista[min_index] = aux; 

    return lista

print(selection_sort(lista))
