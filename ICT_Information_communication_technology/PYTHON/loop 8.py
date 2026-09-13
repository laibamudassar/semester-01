rows=4
for i in range(rows):
    for s in range(rows-1-i):
        print(" ",end="")
        for j in range(i+1):
            print(2**j,end="")
            for j in range(i-1,-1,-1):
                print(2**j,end=" ")
                print()
