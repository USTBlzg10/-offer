class MinNumberInRotateArray:
    def minNumberInRotateArray(self, array):
        low = 0
        high = len(array)-1
        mid = -1
        if len(array)==0:
            return 0
        while array[low] >= array[high]:
            if high -1 == low:
                mid = high
                break
            mid = (low + high) >> 1
            if array[mid] > array[0]:
                low = mid
            if array[mid] < array[0]:
                high = mid
        return array[mid]
if __name__ == '__main__':
    test = MinNumberInRotateArray()
    array = [3, 4, 5, 6, 1, 2]
    print(test.minNumberInRotateArray(array))