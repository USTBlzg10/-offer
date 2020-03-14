class UglyNumber:
    def UglyNumber(self, index):
        arr = [1]
        if index < 7:
            return index
        p2, p3, p5 = 0, 0, 0
        while len(arr) < index:
            v2 = arr[p2] * 2
            v3 = arr[p3] * 3
            v5 = arr[p5] * 5
            mini = min(v2, v3, v5)
            arr.append(mini)
            if v2 == mini: p2 += 1
            if v3 == mini: p3 += 1
            if v5 == mini: p5 += 1
        return arr[-1]
if __name__ == '__main__':
    test = UglyNumber()
    print(test.UglyNumber(100))