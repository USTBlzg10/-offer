class LeftRotateString:
    def LeftRotateString(self, str, n):
        return str[n:]+str[:n]
if __name__ == '__main__':
    test = LeftRotateString()
    str = 'abcXYZdef'
    print(test.LeftRotateString(str, 3))