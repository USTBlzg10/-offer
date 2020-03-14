class SelectSort:
    def selectSort(self, nums):
        n = len(nums)
        for i in range(0, n):
            min = i # min作为当前最小值的下标
            for j in range(i+1, n): #在后面选择出最小的值的下标作为min
                if nums[j] < nums[min]:
                    min = j
            if i != min:
                temp = nums[i]
                nums[i] = nums[min] #把这一趟选择出来的最小值放到无序序列的最前面
                nums[min] = temp

if __name__ == '__main__':
    test = SelectSort()
    nums = [20, 12, 8, 16, 22, 19, 25, 6, 32, 14]
    test.selectSort(nums)
    print(nums)