class Permutation:
    def permutation(self,str):
        res = set()
        if len(str) <= 1:
            return str
        for i in range(len(str)):
            for j in self.permutation(str[:i]+str[i+1:]):
                res.add(str[i]+j)
        return sorted(res)

if __name__ == '__main__':
    test = Permutation()
    str = "abc"
    print(test.permutation(str))