class Add:
    def Add(self, num1, num2):
        if not num1:
            return num2
        if not num2:
            return num1
        while num2 != 0:
            n1 = num1 ^ num2
            n2 = (num1 & num2) <<1
            num1 = n1 & 0xFFFFFFFF
            num2 = n2
        return n1 if num1 >> 31 == 0 else num1 - 4294967296

if __name__ == '__main__':
    test = Add()
    print(test.Add(12, 15))