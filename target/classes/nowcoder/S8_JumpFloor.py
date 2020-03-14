class JumpFloor:
    def jumpFloor(self, target):
        if target < 0:
            return -1
        if target <= 2:
            return target
        num1 = 1
        num2 = 2
        for i in range(2, target):
            current = num1 + num2
            num1 = num2
            num2 = current
        return current
if __name__ == '__main__':
    test = JumpFloor()
    print(test.jumpFloor(10))