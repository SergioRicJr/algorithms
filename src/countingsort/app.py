# possui array auxiliar de tamanho igual ao maior valor a ser ordenado
# usado para contar quantas vezes cada valor ocorre

def couting_sort(vector: list):
    lenght = len(vector)
    max_value = max(vector) + 1
    aux = [0 for i in range(max_value)]
    
    for i in range(lenght):
        aux[vector[i]] += 1
    
    vetor_index = 0

    for j in range(max_value):
        if aux[j] > 0:
            for i in range(aux[j]):
                vector[vetor_index] = j
                vetor_index += 1

    return vector

sorted_list = couting_sort([1,8,4,12,15,13,13,8,8, 0])
print(sorted_list)