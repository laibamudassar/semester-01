while True:
    num=int(input("Enter a number:"))
    if num<=1:
        print("Not a prime number")
        continue
    is_prime=True
    for i in range(2,num):
     if num%i==0:
        is_prime=False
        break
    if is_prime:
        print("prime number entered")
        break
    else:
        print("not a prime Number")
