class IsPopOrder:
    def isPopOrder(self, pushA, popA):
        stack = []
        j = 0
        for i in range(len(pushA)):
            stack.append(pushA[i])
            while stack and stack[-1] == popA[j]:
                stack.pop()
                j += 1
        if len(stack) == 0:
            return True
        else: return False

if __name__ == '__main__':
    test = IsPopOrder()
    pushA = [1, 2, 3, 4, 5]
    popA = [4, 5, 3, 2, 1]
    print(test.isPopOrder(pushA, popA))