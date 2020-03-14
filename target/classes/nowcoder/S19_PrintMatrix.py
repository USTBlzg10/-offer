# 可以模拟魔方逆时针旋转的方法，一直做取出第一行的操作
# 例如
# 1 2 3
# 4 5 6
# 7 8 9
# 输出并删除第一行后，再进行一次逆时针旋转，就变成：
# 6 9
# 5 8
# 4 7
# 继续重复上述操作即可。
class PrintMatrix:
    def printMatrix(self, matrix):
        result = []
        while matrix:
            result += matrix.pop(0)
            if not matrix:
                break
            matrix = self.turn(matrix)
        return result
    def turn(self, matrix):
        #魔方旋转
        col = len(matrix[0]) #列数
        newMat = []
        for i in range(col, 0, -1):
            newMat.append([x[i-1] for x in matrix])
        return newMat
if __name__ == '__main__':
    test = PrintMatrix()
    matrix = [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12], [13, 14, 15, 16]]
    print(test.printMatrix(matrix))
