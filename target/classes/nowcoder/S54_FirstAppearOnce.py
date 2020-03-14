class FirstAppearOnce:
    def __init__(self):
        self.s = ""
    def FirstAppearOnce(self):
        res = list(filter(lambda c: self.s.count(c) == 1, self.s))
        return res[0] if res else "#"
    def Insert(self, char):
        self.s += char
if __name__ == '__main__':
    test = FirstAppearOnce()
    chars = ['g','o','o','g','l','e']
    for i in chars:
        test.Insert(i)
    print(test.FirstAppearOnce())