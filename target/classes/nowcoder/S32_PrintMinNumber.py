class PrintMinNumber:
    def compare(self, num1, num2):
        t = str(num1)+str(num2)
        r = str(num2)+str(num1)
        if t > r: return 1
        elif r > t: return -1
        else: return 0

    def printMinNumber(self, numbers):
        if numbers is None:
            return ""
        lens = len(numbers)
        if lens == 0:
            return ""
        tmpNumbers = sorted(numbers.compare())
        return int(''.join(str(x)for x in tmpNumbers))

if __name__ == '__main__':
    test = PrintMinNumber()
    numbers = [3, 32, 312]
    print(test.printMinNumber(numbers))