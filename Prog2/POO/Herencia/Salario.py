class Salario():

    def valorSalarioMes(self, cantHoraExtras):
        self.cantHoraExtras = cantHoraExtras * 15000
        print(f'El valor total de horas extras es de: {self.cantHoraExtras}')