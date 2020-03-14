class ReOrderArray:
    def reOrderArray(self, array):
        lo = []
        le = []
        for i in range(len(array)):
            if array[i] % 2 == 1:
                le.append(array[i])
            else:
                lo.append(array[i])
        return le + lo
        # i = 0
        # while i < len(array):
        #     if array[i] % 2 == 1:
        #         i += 1
        #     else:
        #         j = i + 1
        #         while j< len(array) and array[j] % 2 == 0:
        #             j += 1
        #         if j >= len(array):
        #             break
        #         temp = array[j]
        #         while j > i:
        #             array[j] = array[j-1]
        #             j -= 1
        #         array[i] = temp
        #         i += 1
if __name__ == '__main__':
    test = ReOrderArray()
    array = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    print(test.reOrderArray(array))
    # for i in range(len(array)):
    #     print(array[i], end=" ")