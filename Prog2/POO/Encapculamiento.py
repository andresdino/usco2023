class Coche:
    #Constructor
    def __init__(self, marca, kilometraje, color):
        self.__marca = marca
        self.__kilometraje = kilometraje
        self.color = color
    

    def arrancar(self, arrancamos):
        self.arrancamos = arrancamos
        if(self.arrancamos):
            return 'El Coche esta en movimiento'
        else:
            return 'EL coche esta detenido'
    
    def __str__(self):
        return 'El auto de marca {} con Kilometraje {} es de color {} y esta {}'.format(self.__marca, self.__kilometraje, self.color, objMiCoche.arrancar(True))


objMiCoche = Coche('Mazda', 45000, 'Rojo')
objMiCoche.color = 'verde'
print(str(objMiCoche))

