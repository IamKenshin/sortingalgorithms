
unsorted = [57, 94, 10, 86, 120]

#QUICKSORT IN PYTHON.   AVERAGE CASE O(n log n).  WORST CASE O(n^2), but very rare.
def partition(list, lo, hi):
        pivot = list[(lo+hi)/2]  # DO NOT USE len(list)/2 TO GET MIDDLE INDEX
        i = lo
        j = hi
        while i <= j:
            while list[i] < pivot:
                i = i + 1
            while list[j] > pivot:
                j = j - 1
            if i <= j:
                temp = list[i]
                list[i] = list[j]
                list[j] = temp
                i = i+1
                j = j-1
        return i
def quickSort(list, lo, hi):
  if lo < hi:     #if lo >= hi than the indices have already met
    partition(list, 0, len(list)-1)
    p = partition(list, lo, hi)
    quickSort(list, lo, p-1)    #Recursive call to sort lower array
    quickSort(list, p, hi)      #Recursive call to sort higher array
    

quickSort(unsorted, 0, len(unsorted)-1)

print unsorted



