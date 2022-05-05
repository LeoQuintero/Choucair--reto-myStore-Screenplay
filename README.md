# Choucair--reto-myStore-Screenplay
Reto de Choucair- reto myStore con patrón  Screenplay

link de automatización: http://automationpractice.com/

## CASO DE PRUEBA UI DE ACEPTACIÓN
  - Scenario: Compra exitosa 2 productos modificando la talla por transferencia bancaria
  - Given que Leonardo se encuentra registrado en la pagina web My Store
  - When el desea iniciar sesion con usuario "leoquintero7@gmail.com" y clave "12345"
  - Then el comprueba el nombre de usuario Leonardo Quintero de inicio sesion
  - When el agrega dos productos al carrito de compra modificando la talla
  - And el realiza el proceso de compra por transferencia bancaria
  - Then el valida que la compra este realizada
