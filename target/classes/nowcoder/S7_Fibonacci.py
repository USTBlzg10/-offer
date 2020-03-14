class Fibonacci:
    def fibonacci(self, n):
        res = [0, 1]
        while len(res) <= n:
            res.append(res[-1] + res[-2])
        return res[n]
if __name__ == '__main__':
    test = Fibonacci()
    print(test.fibonacci(3))