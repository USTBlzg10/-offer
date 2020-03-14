class BinaryInsertSort:
    def binaryInsertSort(self, nums):
        n = len(nums)
        for i in range(1, n):
            low = 0
            high = i-1
            temp = nums[i]
            while low <= high:
                mid = (low + high) >> 1
                if nums[mid] > temp:
                    high = mid-1
                else:
                    low = mid +1
            if i > high: #high 发生了改变，需要交换位置
                for j in range(i-1, low-1, -1):
                    nums[j+1] = nums[j]
            nums[low] = temp
if __name__ =='__main__':
    test = BinaryInsertSort()
    nums = [49, 38, 65, 97, 76, 13, 27, 49]
    test.binaryInsertSort(nums)
    print(nums)