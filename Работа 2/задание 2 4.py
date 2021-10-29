# -- coding: utf-8 --

def w():
    print("Введите 4 числа")
    a = int(input())
    b = int(input())
    l = int(input())
    N = int(input())
    return (2 * N - 1) * a + 2 * 1 + 2 * (N - 1) * b
print(w())