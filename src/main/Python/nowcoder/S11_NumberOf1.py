class NumberOf1:
    def numberOf1(self, n):
        return sum([(n >> i & 1) for i in range(0, 32)])
if __name__ == '__main__':
    test = NumberOf1()
    print(test.numberOf1(-32))