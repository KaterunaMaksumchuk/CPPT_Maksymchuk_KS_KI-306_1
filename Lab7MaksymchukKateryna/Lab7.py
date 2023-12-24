import sys

rows_num = int(input("Введіть розмір квадратної матриці: "))
lst = []
filler = input("Введіть символ-заповнювач: ")

if len(filler) == 0:
 print("Не введено символ-заповнювач")
 sys.exit(1)

elif len(filler) == 1:
 for i in range(rows_num):
  lst.append([])
  for j in range(rows_num-i):
    lst[i].append(ord(filler))
    print(chr(lst[i][j]), end=" ")
  print(end="\n")

else:
 print("Забагато символів-заповнювачів")
 sys.exit(1)