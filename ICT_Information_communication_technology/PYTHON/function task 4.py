import math
def area(shape="rectangle", length=0, width=0, side=0, radius=0, base=0, height=0):
    if shape == "rectangle":
        return length * width
    elif shape == "square":
        return side * side
    elif shape == "circle":
        return math.pi * radius * radius
    elif shape == "triangle":
        return 0.5 * base * height
    else:
        return "Invalid shape"
print(area("rectangle", length=5, width=4))
print(area("square", side=6))
print(area("circle", radius=3))
print(area("triangle", base=10, height=5)) 
