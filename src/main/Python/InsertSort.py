class InsertSort:
    def insertSort(self, nums):
        n = len(nums)
        for i in range(n):
            temp = nums[i]
            j = i-1
            while j >= 0 and temp < nums[j]:
                nums[j+1] = nums[j]
                j -= 1
            nums[j+1] = temp
if __name__ == '__main__':
    nums = [49, 38, 65, 97, 76, 13, 27, 49]
    test = InsertSort()
    test.insertSort(nums)
    print(nums)