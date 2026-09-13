lst = [10, 20, 30, 40, 50, 60, 70]
result = [lst[i]
for i in range(len(lst)) if i not in (0, 4, 5)]
print(result) 
