# -- coding: utf-8 --

s=input()
print(':::::::::')
print('1/', s[2])
x=int(len(s))-2
print('2/', s[x])
print('3/', s[:5])
print('4/', s[x])
x=int(len(s))
print('5/', s[0:x:2])
x=int(len(s))
print('6/', s[1:x:2])
print('7/', s[::-1])
print('8/', s[::-2])
x=len(s)
print('9/',x)