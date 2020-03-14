class Power:
    def power(self, base, exponent):
        if self.equal(base, 0.0) and exponent < 0:
            return 0.0
        absexponent = exponent
        if exponent < 0:
            absexponent = -exponent
        res = self.getPower(base, absexponent)
        if exponent < 0:
            res = 1.0/res
        return res
    def equal(self, num1, num2):
        if num1-num2>-0.0000001 and num1-num2<0.0000001:
            return True
        return False
    def getPower(self, b, e):
        if e == 0:
            return 1.0
        if e == 1:
            return b
        res = self.getPower(b, e >> 1)
        res *= res
        if e&1==1:
            res *= b
        return res

if __name__ == '__main__':
    test = Power()
    print(test.power(2, -5))