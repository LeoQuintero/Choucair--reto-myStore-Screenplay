#Autor: Leonardo Quintero
@HistoriaDeUsuario
Feature: Proceso de compra en la tienda online
  Yo como usuario QUIERO realizar el proceso de compra de un producto de la tienda PARA adquirir un producto

  @CompraExitosa1ProductoPorCheque
  Scenario: Compra exitosa 2 productos modificando la talla por transferencia bancaria
  Given que Leonardo se encuentra registrado en la pagina web My Store
  When el desea iniciar sesion con usuario "leoquintero7@gmail.com" y clave "12345"
  Then el comprueba el nombre de usuario Leonardo Quintero de inicio sesion
  When el agrega dos productos al carrito de compra modificando la talla
  And el realiza el proceso de compra por transferencia bancaria
  Then el valida que la compra este realizada




