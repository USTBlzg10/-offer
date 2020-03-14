class StackToQueue:
    a = []
    b = []
    def push(self, node):
        self.a.append(node)
    def pop(self):
        if(len(self.b)==0):
            while len(self.a) > 0:
                c = self.a.pop()
                self.b.append(c)
        return self.b.pop()
if __name__ == '__main__':
    a = [1, 2, 3, 4, 5]
    test = StackToQueue()
    for i in range(len(a)):
        test.push(a[i])
    print(len(test.a))
    print(test.pop())