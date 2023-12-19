def calcular_mdc(a, b):
    while b:
        a, b = b, a % b
    return a

def calcular_lcm(a, b):
    if a == 0 or b == 0:
        return 0
    
    mdc = calcular_mdc(a, b)

    lcm = a * b // mdc if a * b > 0 else a * b // -mdc

    return lcm

numero1 = 12
numero2 = 18

lcm_resultado = calcular_lcm(numero1, numero2)
print(f"O LCM de {numero1} e {numero2} é: {lcm_resultado}")