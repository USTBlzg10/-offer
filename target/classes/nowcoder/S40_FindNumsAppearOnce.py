class FindNumsAppearOnce:
    #hash法
    def findNumsAppearOnce(self, array):
        hashMap = {}
        for i in array:
            if str(i) in hashMap:
                hashMap[str(i)] += 1
            else:
                hashMap[str(i)] = 1
        res = []
        for i in hashMap.keys():
            if hashMap[i] == 1:
                res.append(int(i))
        print(res)
if __name__ == '__main__':
    test = FindNumsAppearOnce()
    array = [1, 2, 1, 2, 3, 3, 4, 5, 6, 4, 7, 6, 8, 7]
    test.findNumsAppearOnce(array)
