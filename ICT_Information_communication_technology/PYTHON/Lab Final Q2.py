n=int(input("Enter a number"))
for i in range(n):
    print("Table of", i)
    for j in range(1,11):
        print(i,"*", j, "=", i * j)
        print() 
