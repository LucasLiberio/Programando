import math
num = float(input('Escreva um numero: '))
num2 = float(input('Escreva outro numero: '))
cat = math.pow(num, 2)
cat2 = math.pow(num2, 2)
hipo = math.sqrt(cat+cat2)
print('A hipotenusa do tiangulo retangulo é {:.2f}'.format(hipo))
