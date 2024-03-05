def binary_search(array, item, begin_index=0, end_index=None):
    if end_index is None:
        end_index = len(array)-1
    if begin_index <= end_index:
        middle_index = (begin_index + end_index)//2
        if array[middle_index] == item:
            return middle_index
        if item < array[middle_index]:
            return binary_search(array, item, begin_index, middle_index-1)
        else:
            return binary_search(array, item, middle_index+1, end_index)
    return None

lista = [2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18]

print(binary_search(lista, 14))