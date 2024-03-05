lista = [8, 4, 5, 1, 9, 3, 2, 6, 12, 5, 2]

def insertion_sort(lista: list):
    tamanho = len(lista)

    for i in range(1, tamanho, 1):
        j = i - 1

        while j >= 0 and lista[j] > lista[j+1]:
            temp = lista[j+1]
            lista[j+1] = lista[j]
            j -= 1
            lista[j+1] = temp

    return lista

def insertion_sort_alt(lista: list):
    tamanho = len(lista)

    for i in range(1, tamanho):
        chave = lista[i]
        j = i -1

        while j >= 0 and lista[j] > chave:
            lista[j+1] = lista[j]
            lista[j] = chave
            j -= 1
    
    return lista
            

def insertion_sort_classic(lista: list):
    tamanho = len(lista)

    for i in range(1, tamanho):
        chave = lista[i]
        j = i -1

        while j >= 0 and lista[j] > chave:
            lista[j+1] = lista[j]
            j -= 1
            lista[j+1] = chave 

    return lista

    
print(insertion_sort(lista))