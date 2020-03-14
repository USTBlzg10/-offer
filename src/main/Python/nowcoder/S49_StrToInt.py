class StrToInt:
    def strToInt(self,str):
        if len(str) == 0 or not str:
            return 0
        start = 0
        symbol = 1
        res = 0
        if str[0] == '+':
            start = 1
        elif str[0] == '-':
            start = 1
            symbol = -1
        for i in range(start, len(str)):
            if str[i] >= '0' and str[i] <= '9':
                res = res * 10 + ((ord(str[i]) - ord('0')))
            else:
                return 0
        if res > 2147483647:
            return 0
        return symbol * res
if __name__ == '__main__':
    test = StrToInt()
    print(test.strToInt("-2147483649"))
