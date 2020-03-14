class FindGreatestSumOfSubArray:
    def FindGreatestSumOfSubArray(self,array):
        max = 0
        temp = 0
        for i in range(len(array)):
            if temp <= 0:
                temp = array[i]
            else:
                temp += array[i]
            if temp > max:
                max = temp
        return max
if __name__ == '__main__':
    test = FindGreatestSumOfSubArray()
    array = [1,-2,3,10,-4,7,2,-5]
    print(test.FindGreatestSumOfSubArray(array))