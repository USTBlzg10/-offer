class Sum:
    def sum(self, n):
        tsum = n
        tmp = tsum and self.sum(n-1)
        tsum += tmp
        return tsum
if __name__ == '__main__':
    test = Sum()
    print(test.sum(10))