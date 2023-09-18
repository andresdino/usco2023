class Personas:

    #Declaramos el constructor con los atributos
    def __init__(self, nombre, altura, peso, email):
        self.nombre = nombre
        self.altura = altura
        self.peso = peso
        self.email = email

    #Declaramos el metodo imprimir el cual genera una salida en pantalla con todos
    #los datos enviados por el objeto
    def imprimir(self):
        print(f'El nombre {self.nombre} altura {self.altura} ')


#Creamos el objeto objPersonas e instanciamos la clase Personas
#Le pasamos los valores de los atributos
objPersona = Personas("Hector", "187", 120, "andres@gmail.com")

#Invocamos el metodo imprimir para generar una salida en pantalla de
#los atributos declarados.
objPersona.imprimir()


