from Persona import Persona
from Salario import Salario


class Empleado(Persona, Salario):
    def datosEmpleado(self, salario, cargo):
        print(f'El salario es {salario} ')
        print(f'El cargo es {cargo}')


objEmpleado = Empleado('Juan', 20, 'Masculino')
objEmpleado.datosPersonales()
objEmpleado.datosEmpleado(2000000, 'Dev')
objEmpleado.valorSalarioMes(50)


