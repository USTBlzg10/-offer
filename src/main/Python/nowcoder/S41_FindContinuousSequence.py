class FindContinuousSequence:
    def FindContinuousSequence(self, sum):
        res = []
        if sum <= 1:
            return res
        pLow = 1
        pHigh = 2
        while pHigh > pLow:
            cur = (pLow + pHigh)*(pHigh - pLow + 1)/2
            tmp = []
            if cur == sum:
                for i in range(pLow, pHigh+1):
                    tmp.append(i)
                res.append(tmp)
                pLow += 1
            elif cur < sum:
                pHigh += 1
            else: pLow += 1
        return res

if __name__ == '__main__':
    test = FindContinuousSequence()
    print(test.FindContinuousSequence(100))