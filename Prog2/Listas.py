varLista = ['Hector', True, 5.5, 9]
"""
del varLista[0]
varLista.insert(1, "Cual?")
varLista.append('USCO')
#varLista.append(input("Inserte la ciudad: "))

eliminar = input("Digite el valor a eliminar: ")
contador = 0

for z in varLista:
    if eliminar == z:
        del varLista[contador]
    else:
        contador +=1
    
print(varLista)"""



datos = [['Hector', 'Sanchez', 36], ['Maria', 'Lugo', 28], ['Juan','Silva', 17]]

for w in datos:
    print(w)


for z in datos:
    for u in z:
        print(u)
    print("------")





































