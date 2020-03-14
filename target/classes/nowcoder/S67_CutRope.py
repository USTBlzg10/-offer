class CutRope:
    def cutRope(self, number):
        if number < 2:
            return 0
        if number == 2:
            return 1
        if number == 3:
            return 2
        timesOf3 = number / 3
        timesOf2 = (number - timesOf3 * 3) / 2
        return int(pow(3, timesOf3)) * int(pow(2, timesOf2))
if __name__ == '__main__':
    test = CutRope()
    print(test.cutRope(8))