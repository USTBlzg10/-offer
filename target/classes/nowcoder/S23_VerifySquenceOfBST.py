class VerifySquenceOfBST:
    def verifySquenceOfBST(self, sequence):
        if len(sequence) == 0:
            return False
        if len(sequence) == 1:
            return True
        root = sequence[-1]
        i = 0
        #左子树个数i
        for node in sequence[:-1]:
            if node > root:
                break
            i += 1
        for node in sequence[i+1:-1]:
            if node < root:
                return False
        return self.verifySquenceOfBST(sequence[:i]) or self.verifySquenceOfBST(sequence[i+1:-1])

if __name__ == '__main__':
    test = VerifySquenceOfBST()
    sequence = [3, 5, 4, 7, 9, 8, 6]
    print(test.verifySquenceOfBST(sequence))