
def merge(arr1, arr2, merged):
    if arr1 == [] or arr2 == []:
        return merged + arr1 + arr2
    else:
        if arr1[0] < arr2[0]:
            merged += [arr1[0]]
            arr1 = arr1[1:]
        else:
            merged += [arr2[0]]
            arr2= arr2[1:]
    
    return merge(arr1,arr2, merged)
    
def mergesort(arr):
    if len(arr) <= 1:
        return arr
    else:
        mid = len(arr) // 2
        arr1 = arr[:mid]
        arr2 = arr[mid:]
        return merge(mergesort(arr1), mergesort(arr2), [])
