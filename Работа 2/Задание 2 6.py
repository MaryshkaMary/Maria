# -- coding: utf-8 --

def e():
    print('Введите 4 числа от 1 до 8')
    s1 = int(input())
    sb1 = int(input())
    s2 = int(input())
    sb2 = int(input())
    if ((s1 and sb1) >= 1 and (s1 and sb1) <= 8) and ((s2 and sb2) >= 1 and (s2 and sb2) <= 8):
        if (s1 % 2 == 1 and sb1 % 2 == 1) or (s1 % 2 == 0 and sb1 % 2 == 0) :
            c1 = str("Белый")
        else:
            c1 = str("Черный")
        if (s2 % 2 == 1 and sb2 % 2 == 1) or (s2 % 2 == 0 and sb2 % 2 == 0):
            c2 = str("Белый")
        else:
            c2 = str("Черный")
    else:
        return "Ошибка"
    if c1 == c2:
        return "Да"
    else:
        return "Нет"
print(e())