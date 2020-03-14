class FindNumsAppearOnce_new:
    def findNumsAppearOnce(self, array):
        if not array:
            return []
        bitResult = 0
        for i in array:
            bitResult ^= i
        print(bitResult)
        index = self.findFirst1(bitResult)
        a = b = 0
        for i in array:
            if self.isBit1(i, index):
                a ^= i
            else:
                b ^= i
        print([a, b])
        return [a, b]
    def findFirst1(self, bitResult):
        index = 0
        while (bitResult & 1) == 0:
            bitResult >>= 1
            index += 1
        return index
    def isBit1(self, target, index):
        target = target >> index
        return target & 1
if __name__ == '__main__':
    test = FindNumsAppearOnce_new()
    array = [4,6,2,2,3,3,8,8,9,9,1000000,1000000]
    test.findNumsAppearOnce(array)