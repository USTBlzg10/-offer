class FindNumbersWithSum:
    def FindNumbersWithSum(self, array, tsum):
        list = []
        if not array or len(array) == 0:
            return list
        i = 0
        j = len(array)-1
        while i < j:
            if array[i] + array[j] == tsum:
                list.append(array[i])
                list.append(array[j])
                return list
            elif array[i] + array[j] > tsum:
                j -= 1
            else: i += 1
        return list
if __name__ == '__main__':
    test = FindNumbersWithSum()
    array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    print(test.FindNumbersWithSum(array, 10))