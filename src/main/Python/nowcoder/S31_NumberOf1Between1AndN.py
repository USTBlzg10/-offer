class NumberOf1Between1AndN:
    def numberOf1Between1AndN(self,n):
        #把1-n全部转换成字符，统计每个数对应字符中1的个数
        count = 0
        # for i in range(1, n+1):
        #     for i in str(i):
        #         if i == '1':
        #             count += 1
        res = ''
        for i in range(n+1):
            res += str(i)
        count = res.count('1')
        return count
if __name__ == '__main__':
    test = NumberOf1Between1AndN()
    print(test.numberOf1Between1AndN(13))