# -- coding: utf-8 --

def w():
    print('Введите 3 числа')
    x = int(input())
    y = int(input())
    z = int(input())
    return min(x,y,z)
print (w())