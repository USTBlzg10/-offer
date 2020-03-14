class HasPath:
    def hasPaht(self, matrix, rows, cols, path):
        if not matrix:
            return False
        if not path:
            return True
        x = [list(matrix[cols*i: cols*i+cols]) for i in range(rows)]
        for i in range(rows):
            for j in range(cols):
                if self.judge(x, i, j, path):
                    return True
        return False
    def judge(self, matrix, i, j, p):
        if matrix[i][j] == p[0]:
            if not p[1:]:
                return True
            matrix[i][j] = ''
            if i > 0 and self.judge(matrix, i-1, j, p[1:]):
                return True
            if i < len(matrix)-1 and self.judge(matrix, i+1, j, p[1:]):
                return True
            if j < len(matrix[0])-1 and self.judge(matrix, i, j+1, p[1:]):
                return True
            matrix[i][j] = p[0]
            return False
        else:
            return False
if __name__ == '__main__':
    test = HasPath()
    matrix = ['a', 'b', 'c', 'e', 's', 'f', 'c', 's', 'a', 'd', 'e', 'e']
    path = ['b', 'c', 'c', 'e', 'd']
    strs = ['a', 'b', 'c', 'b']
    print(test.hasPaht(matrix, 3, 4, path))