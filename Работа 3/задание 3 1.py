# -- coding: utf-8 --
a=b=1
N=int(input('Количество символов '))
print(a, b, end='')
for i in range(2, N):
    a, b=b, a+b
    print(b, end='')
