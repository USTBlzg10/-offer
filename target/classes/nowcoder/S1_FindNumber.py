# -*- coding:utf-8 -*-
class Solution:
    # array 二维列表
    def Find(self, target, array):
        # write code here
        m = len(array)-1 #行数
        n = len(array[0])-1 #列数
        i = m
        j = 0
        while i >= 0 and j <= n:
            if target > array[i][j]:
                j += 1
            elif target < array[i][j]:
                i -= 1
            else:
                return True
        return False
if __name__ == '__main__':
    test = Solution()
    array = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    result = test.Find(7, array)
    print(result)