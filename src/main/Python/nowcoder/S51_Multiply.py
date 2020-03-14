class Multiply:
    def multiply(self, A):
        length = len(A)
        B = []
        for i in range(length):
            temp = A[i]
            b = 1
            for j in range(length):
                A[i] = 1
                b *= A[j]
            B.append(b)
            A[i] = temp
        return B
if __name__ == '__main__':
    test = Multiply()
    A = [1, 2, 3, 4, 5]
    print(test.multiply(A))
