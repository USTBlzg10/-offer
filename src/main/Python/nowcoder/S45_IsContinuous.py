class IsContinuous:
    def isContinuous(self, numbers):
        if not numbers:
            return False
        numbers.sort()
        zeroNum = numbers.count(0)
        for i, v in enumerate(numbers[:-1]):
            if v != 0:
                if numbers[i+1] == v:
                    return False
                zeroNum = zeroNum - (numbers[i+1] - v) + 1
                if zeroNum < 0:
                    return False
        return True
if __name__ =='__main__':
    test = IsContinuous()
    array = [1, 3, 0, 0, 7, 5, 2]
    print(test.isContinuous(array))