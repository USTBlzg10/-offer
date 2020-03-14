class JumpFloorII:
    def jumpFloorII(self, number):
        if number <= 0:
            return -1
        elif number==1:
            return 1
        else:
            return 2*self.jumpFloorII(number-1)
if __name__ == '__main__':
    test = JumpFloorII()
    print(test.jumpFloorII(4))