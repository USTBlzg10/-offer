class LastRemaining:
    def lastRemaining(self, n, m):
        if n < 1 or m < 1:
            return -1
        lastPosition = 0
        for i in range(2, n+1):
            lastPosition = (lastPosition + m)% i
        return lastPosition
if __name__ == '__main__':
    test = LastRemaining()
    print(test.lastRemaining(10, 4))