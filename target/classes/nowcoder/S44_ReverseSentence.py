class ReverseSentence:
    def ReverseSentence(self,str):
        # buffer = str.split(" ")
        # res = ""
        # for i in range(len(buffer)-1, -1, -1):
        #     res += buffer[i]
        #     if i>0:
        #         res += " "
        return " ".join(str.split(" ")[::-1])
if __name__ == '__main__':
    test = ReverseSentence()
    str = "student. a am I"
    print(test.ReverseSentence(str))