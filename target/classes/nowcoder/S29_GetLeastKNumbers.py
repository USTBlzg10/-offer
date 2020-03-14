class GetLeastKNumbers:
    def getLeastKNumbers(self, input, k):
        if len(input) == 0 or k <=0 or k > len(input):
            return []
        #构建容量为k的大根堆
        for i in range(k//2, -1, -1):
            self.sift(input, i, k-1)
        for i in range(k, len(input)):
            if input[i] < input[0]:
                input[0] = input[i]
                self.sift(input, 0, k-1)
        numbers = []
        for i in range(k):
            numbers.append(input[i])
        return numbers
    def sift(self,array,low,high):
        i = low
        temp = array[i]
        j = 2*i+1
        while j <= high:
            if j < high and array[j] < array[j+1]:
                j += 1
            if temp < array[j]:
                array[i] = array[j]
                i = j
                j = i*2+1
            else:
                break
        array[i] = temp

if __name__ == '__main__':
    test = GetLeastKNumbers()
    input = [4,5,1,6,2,7,3,8]
    print(test.getLeastKNumbers(input, 3))