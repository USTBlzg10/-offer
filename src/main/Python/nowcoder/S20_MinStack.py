class MinStack:
    stack = []
    minStack = []
    def push(self, node):
        if not self.minStack or node < self.minStack[-1]:
            self.minStack.append(node)
        else:
            self.minStack.append(self.minStack[-1])
    def pop(self):
        if not self.stack:
            return None
        self.minStack.pop()
        return self.stack.pop()
    def peek(self):
        if not self.stack:
            return None
        return self.stack[-1]
    def min(self):
        if not self.minStack:
            return None
        return self.minStack[-1]