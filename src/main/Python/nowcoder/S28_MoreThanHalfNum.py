class MoreThanHalfNum:
    def moreThanHalfNum(self, array):
        if len(array) == 0:
            return 0
        result = array[0]
        count = 1
        for i in range(len(array)):
            if count == 0:
                result = array[i]
                count = 1
            else:
                if array[i] == result:
                    count += 1
                else:
                    count -= 1
        count = 0
        for i in range(len(array)):
            if array[i] == result:
                count += 1
        if count*2 > len(array):
            return result
        else:
            return 0
if __name__ == '__main__':
    test = MoreThanHalfNum()
    array = [1, 2, 2, 3, 7, 2, 3, 2, 8, 2, 9, 2, 2]
    print(test.moreThanHalfNum(array))