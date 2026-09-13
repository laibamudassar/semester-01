year=int(input("Enter a year:"))
month=int(input("Enter a month(1-12):"))
zoadicYear=year%12
if zoadicYear==0:
    print("Monkey")
elif zoadicYear==1:
    print("Rooster")
elif zoadicYear==2:
    print("Dog")
elif zoadicYear==3:
    print("pig")
elif zoadicYear==4:
    print("rat")
elif zoadicYear==5:
    print("ox")
elif zoadicYear==6:
    print("tiger")
elif zoadicYear==7:
    print("Rabbit")
elif zoadicYear==8:
    print("Dragon")
elif zoadicYear==9:
    print("Snake")
elif zoadicYear==10:
    print("horse")
else:
    print("Sheep")
