class Match:
    def match(self, str, pattern):
        if not str or not pattern:
            return False
        return self.matchCore(str, 0, pattern, 0)
    def matchCore(self, str, strIndex, pattern, patternIndex):
        if strIndex == len(str) and patternIndex == len(pattern):
            return True
        if patternIndex == len(pattern) and strIndex != len(str):
            return False
        #第2个匹配字符是*
        if patternIndex+1 < len(pattern) and pattern[patternIndex+1] == '*':
            if pattern[patternIndex] == str[strIndex] or pattern[patternIndex] == '.':
                return self.matchCore(str, strIndex, pattern, patternIndex+2) \
                       or self.matchCore(str, strIndex+1, pattern, patternIndex+1) \
                       or self.matchCore(str, strIndex+1, pattern, patternIndex)
            else:
                return self.matchCore(str, strIndex, pattern, patternIndex+2)
        #模式第2个不是*，且字符串第1个跟模式第1个匹配，则都后移1位，否则直接返回false
        if strIndex != len(str) and str[strIndex] == pattern[patternIndex] or strIndex != len(str) and pattern[patternIndex] == '.':
            return self.matchCore(str, strIndex+1, pattern, patternIndex+1)
        else:
            return False
if __name__ == '__main__':
    test = Match()
    str = ['a', 'a', 'a']
    pattern = ['a', 'b', '*', 'a', 'c', '*']
    print(test.match(str, pattern))
