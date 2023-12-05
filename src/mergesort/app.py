# Dividir para conquistar

# Primeiro separa a lista em varios dados menores
# Depois une eles ordenando

# Divide ate ficar cada item separado
# As listas individuais já são ordenadas, pq so tem um
# Aí vai juntando e comparando os valores em lista de dois e juntando novamente nos conjuntos maiores, já ordenados
# para avaliar qual é o menor conjunto ao juntar é necessário ver o menor numero da lista
# ai a pilha da esquerda que é o menor vai para a esquerda, o outro da esquerda vai logo depois
# e então o menor da pilha da direita é juntado e segue assim, ordenando ao juntar


# a divisão não ocorre de maneira fisica, e sim lógica, 
#  guardando a posição
def mergesort(lista, inicio=0, fim=None):
    if fim is None:
        fim = len(lista)
    # se o tamanho for maior que 1, pois não da pra dividir lista de 1
    if(fim - inicio > 1):
        meio = (fim + inicio)//2
        mergesort(lista, inicio, meio)
        mergesort(lista, meio, fim)
        merge(lista, inicio, meio, fim)

def merge(lista, inicio, meio, fim):
    left = lista[inicio:meio]
    right = lista[meio:fim]
    top_left, top_right = 0, 0
    for k in range(inicio, fim):
        if top_left >= len(left):
            lista[k] = right[top_right]
            top_right = top_right + 1
        elif top_right >= len(right):
            lista[k] = left[top_left]
            top_left = top_left + 1
        elif left[top_left] < right[top_right]:
            lista[k] = left[top_left]
            top_left = top_left + 1
        else:
            lista[k] = right[top_right]
            top_right = top_right + 1

my_list = [
    8,2,9,13,4,7,3,1
]

mergesort(my_list)
print(my_list)