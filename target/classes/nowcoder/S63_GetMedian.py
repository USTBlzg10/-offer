import heapq
class GetMedian:
    def __init__(self):
        self.heaps = [], []
    def insert(self, num):
        small, large = self.heaps
        heapq.heappush(small, -heapq.heappushpop(large, num))
        if len(large) < len(small):
            heapq.heappush(large, -heapq.heappop(small))
    def getMedian(self):
        small, large = self.heaps
        if len(large) > len(small):
            return float(large[0])
        return (large[0] - small[0]) / 2.0

if __name__ == '__main__':
    test = GetMedian()
    array = [5, 2, 3, 4, 1, 6, 7, 0, 8]
    for i in array:
        test.insert(i)
        print(test.getMedian())