physics=85
biology=80
math=90
computer=88
chemistry=75
percentage=(physics+biology+math+computer+chemistry)/5
if percentage>=90:
              grade='A'
elif percentage>=80:
              grade='B'
elif percentage>=70:
              grade='C'
elif percentage>=60:
              grade='D'
elif percentage>=40:
              grade='E'
else:
    grade='F'
print("percentage:",percentage)
print("grade:",grade)
