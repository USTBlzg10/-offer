class Solution:
    def replaceSpace(self, s):
        res = ''
        for i in s:
            if i == ' ':
                res += '%20'
            else:
                res += i
        return res
if __name__ == '__main__':
    test = Solution()
    s = 'We are happy'
    print(test.replaceSpace(s))
