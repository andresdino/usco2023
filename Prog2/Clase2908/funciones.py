#Funciones->  def 
#Bloque de codigo reutilizable-> para utilizarlo en diferentes instancias 
#de nuestra aplicación

#camelCase-> suma resta->  sumaDosNumero -> funciones/ metodos -> objetos o variables
#PascalCase -> Funciones -> SumaDosNumeros ->Archivos, Paquetes y Clases

"""


a = 50
def suma():
    a = 40
    w = 30
    print("Suma ", a + w)

suma()

#Ejemplo2

def resta():
    a = 50
    e = 30
    t = 15
    return (e - t)

print("El resultado es: ", resta)

def alumnos():
    return ["juan", "maria", "jose"]

#print(alumnos()[0])

for val in alumnos():
    print("nombre: ", val)


#Creando una funcion con diccionario

def nombres():
    return {'Maria': 'Sanchez', 'Juan':'Silva'}


for i in nombres():
    print(f"Nombre: {i} Apellido: ", nombres()[i])




def suma(num1, num2, num3):
    resultado = num1 + num2 + num3
    return resultado


valor1 = int(input("Digite el valor 1: "))


print("La suma es: ", suma(valor1, 28, 20))
"""


def suma(*args):
    resultado = 0
    for i in args:
        resultado += i
    return resultado



print("La sumatoria es: ", suma(10, 20, 45, 78, 10))

