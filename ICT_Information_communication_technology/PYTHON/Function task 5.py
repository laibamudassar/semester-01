def pascal_triangle(n):
    for i in range(n):
        number = 1
        for j in range(n - i):
            print(" ", end="")
        for j in range(i + 1):
            print(number, end=" ")
            number = number * (i - j) // (j + 1)
        print()
pascal_triangle(5) 
