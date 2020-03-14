class FirstNotRepeatingChar:
    def firstNotRepeatingChar(self, str):
        dict = {}
        for i in str:
            if i not in dict:
                dict[i] = 1
            else: dict[i] += 1
        for key in dict:
            if dict[key] == 1:
                return str.index(key)
        return -1

if __name__ == '__main__':
    test = FirstNotRepeatingChar()
    str = "google"
    print(test.firstNotRepeatingChar(str))