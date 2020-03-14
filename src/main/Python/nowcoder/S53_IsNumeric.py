import re
class IsNumeric:
    # s字符串
    def isNumeric(self, s):
        m = re.compile("[\+\-]?[0-9]*([\.][0-9]+)?([eE][+-]?[0-9]+)?")
        if re.match(m, s).group() == s:
            return True
        else:
            return False
if __name__ == '__main__':
    test = IsNumeric()
    str = '3.e4'
    print(test.isNumeric(str))