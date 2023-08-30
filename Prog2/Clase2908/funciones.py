#Funciones->  def 
#Bloque de codigo reutilizable-> para utilizarlo en diferentes instancias 
#de nuestra aplicación

#camelCase-> suma resta->  sumaDosNumero -> funciones/ metodos -> objetos o variables
#PascalCase -> Funciones -> SumaDosNumeros ->Archivos, Paquetes y Clases

"""

"""
a = 50
def suma():
    a = 40
    w = 30
    print("Suma ", a + w)

print(suma())

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