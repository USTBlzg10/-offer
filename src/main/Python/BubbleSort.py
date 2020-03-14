class BubbleSort:
    def bubbleSort(self, nums):
        n = len(nums)
        for i in range(n, 0, -1):
            flag = False
            for j in range(1, i):
                if nums[j-1] > nums[j]:
                    temp = nums[j]
                    nums[j] = nums[j-1]
                    nums[j-1] = temp
                    flag = True
            if flag == False: #flag还是False说明一趟下来，序列没有发生变动，已经有序
                return

if __name__ == '__main__':
    test = BubbleSort()
    nums = [49, 38, 65, 97, 76, 13, 27, 49]
    test.bubbleSort(nums)
    print(nums)