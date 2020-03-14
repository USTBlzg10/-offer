class MovingCount:
    def movingCount(self, threshold, rows, cols):
        flag = [[0] * cols for i in range(rows)]
        return self.moving(threshold, rows, cols, 0, 0, flag)
    def moving(self, threshold, rows, cols, i, j, flag):
        if i >= rows or j >= cols or i < 0 or j < 0 or self.sum(i, j) > threshold or flag[i][j] == 1:
            return 0
        flag[i][j] = 1
        return self.moving(threshold, rows, cols, i-1, j, flag) + \
               self.moving(threshold, rows, cols, i+1, j, flag) + \
               self.moving(threshold, rows, cols, i, j-1, flag) + \
               self.moving(threshold, rows, cols, i, j+1, flag) + 1
    def sum(self, i, j):
        if i < 0 or j < 0:
            return 0
        sum = 0
        while i > 0 and j > 0:
            sum += i % 10
            sum += j % 10
            i = i/10
            j = j/10
        return sum

if __name__ == '__main__':
    test = MovingCount()
    print(test.movingCount(4, 2, 2))

