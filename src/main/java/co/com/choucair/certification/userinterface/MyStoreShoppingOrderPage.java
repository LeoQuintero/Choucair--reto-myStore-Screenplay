package co.com.choucair.certification.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MyStoreShoppingOrderPage extends PageObject {
    public static final Target CHECKOUT_BUTTON = Target.the("botón para iniciar el proceso de pago")
            .located(By.xpath("//*[@id='layer_cart']/div[1]/div[2]/div[4]/a"));
    public static final Target CHECKOUT_SUMMARY_BUTTON = Target.the("Verificar resumen compra")
            .located(By.xpath("//*[@id='center_column']/p[2]/a[1]/span"));
    public static final Target CHECKOUT_ADDRESS_BUTTON = Target.the("Verificar dirección")
            .located(By.cssSelector("button[name='processAddress']"));
    public static final Target CHECK_BOX_IGREE = Target.the("Check box para aceptar términos")
            .located(By.className("checker"));
    public static final Target CHECKOUT_SHIPPING_BUTTON = Target.the("Verificar costo envío productos")
            .located(By.cssSelector("button[name='processCarrier']"));
    public static final Target PAY_BY_BANK_BUTTON = Target.the("Papo por transferencia bancaria")
            .located(By.className("bankwire"));
    public static final Target CONFIRM_MY_ORDER_BUTTON = Target.the("Confirmar la orden de compra")
            .located(By.xpath("//*[@id='cart_navigation']/button/span"));
    public static final Target LBL_CONFIRMACION = Target.the("Verificar confirmación de la orden")
            .located(By.className("cheque-indent"));
}
