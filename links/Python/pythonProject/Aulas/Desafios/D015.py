dias = float(input('Quantos dias rodados? '))
taxa1 = dias * 60
Km = float(input('Quantos KM rodados? '))
taxa2 = Km * 0.15
Custo = taxa1 + taxa2
print('Esse é o valor pago pelo cliente R${:.2f}'.format(Custo))
