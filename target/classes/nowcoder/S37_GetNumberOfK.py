class GetNumberOfK:
    def GetNumberOfK(self, array, k):
        first = self.getFirstK(array, k, 0, len(array)-1)
        last = self.getLastK(array, k, 0, len(array)-1)
        return last - first+1
    #递归找第一个k
    def getFirstK(self, array, k, start, end):
        if start>end:
            return -1;
        mid = (start + end) >> 1
        if array[mid] > k:
            return self.getFirstK(array, k, start, mid-1)
        elif array[mid] < k:
            return self.getFirstK(array, k, mid+1, end)
        elif array[mid-1] == k and mid-1>=0:
            return self.getFirstK(array, k, start, mid-1)
        else:
            return mid
    #循环找最后一个k
    def getLastK(self, array, k, start, end):
        while start <= end:
            mid = (start + end) >> 1
            if array[mid] == k and array[mid+1] != k or mid == len(array)-1:
                return mid
            else:
                if array[mid] > k:
                    end -= mid
                else:
                    start += mid
        return -2
if __name__ == '__main__':
    test = GetNumberOfK()
    array = [1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 6, 7, 8, 8]
    print(test.GetNumberOfK(array, 5))
