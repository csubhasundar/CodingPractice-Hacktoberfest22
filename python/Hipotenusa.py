from math import sqrt
from re import X

def hipotenusa(a,b):
    soma = a^2 + b^2
    return sqrt(soma)

x,y = input().split(" ")
x = int(x)
y = int(y)

print(hipotenusa(x,y))