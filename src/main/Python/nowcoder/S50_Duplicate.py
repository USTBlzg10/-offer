class Duplicate:
    def duplicate(self,numbers,dup):
        if not numbers:
            return False
        length = len(numbers)
        for i in range(0, length):
            if numbers[i] > length or numbers[i] < 0:
                return False
            while i != numbers[i]:
                if numbers[i] == numbers[numbers[i]]:
                    dup[0] = numbers[i]
                    print(dup[0])
                    return True
                else:
                    #交换
                    temp = numbers[i]
                    numbers[i] = numbers[temp]
                    numbers[temp] = temp
            return False
if __name__ == '__main__':
    test = Duplicate()
    numbers = [1, 2, 1]
    dup = [1]
    print(test.duplicate(numbers, dup))