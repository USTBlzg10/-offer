class HeapSort:
    def sift(self, nums, low, high):
        i = low
        j = 2 * i
        temp = nums[i]
        while j <= high:
            if j < high and nums[j] < nums[j+1]:
                j += 1
            if nums[j] > temp:
                nums[i] = nums[j]
                i = j
                j = i * 2
            else:
                break
        nums[i] = temp
    def heapSort(self, nums):
        n = len(nums)
        for i in range((n-1)//2, 0, -1):
            self.sift(nums, i, n-1)
            i -= 1
        for i in range(n-1, 0, -1):
            temp = nums[i]
            nums[i] = nums[1]
            nums[1] = temp
            self.sift(nums, 1, i-1)
        return nums

if __name__ == '__main__':
    test = HeapSort()
    nums = [-1, 10, 7, 2, 4, 7, 62, 3, 4, 2, 1, 8, 9, 19]
    test.heapSort(nums)
    print(nums)