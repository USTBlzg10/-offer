class QuickSort:
    def quickSort(self, nums, low, high):
        i = low
        j = high
        if i > j:
            return
        temp = nums[low] #temp也就是这个序列的第一个数作为枢纽
        while i < j:
            while temp <= nums[j] and i < j:
                j -= 1
            if i < j:
                nums[i] = nums[j]
                i += 1
            while nums[i] <= temp and i < j:
                i += 1
            if i < j:
                nums[j] = nums[i]
                j -= 1
        nums[i] = temp
        self.quickSort(nums, low, i-1)
        self.quickSort(nums, i+1, high)
if __name__ =='__main__':
    test = QuickSort()
    nums = [10, 7, 2, 4, 7, 62, 3, 4, 2, 1, 8, 9, 19]
    test.quickSort(nums, 0, len(nums)-1)
    print(nums)