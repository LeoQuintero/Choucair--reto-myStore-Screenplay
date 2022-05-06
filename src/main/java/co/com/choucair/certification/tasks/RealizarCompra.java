package co.com.choucair.certification.tasks;

import co.com.choucair.certification.userinterface.MyStoreShoppingOrderPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class RealizarCompra implements Task {
    public static RealizarCompra pago() {
        return Tasks.instrumented(RealizarCompra.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MyStoreShoppingOrderPage.CHECKOUT_BUTTON),
                Click.on(MyStoreShoppingOrderPage.CHECKOUT_SUMMARY_BUTTON),
                Click.on(MyStoreShoppingOrderPage.CHECKOUT_ADDRESS_BUTTON),
                Click.on(MyStoreShoppingOrderPage.CHECK_BOX_IGREE),
                Click.on(MyStoreShoppingOrderPage.CHECKOUT_SHIPPING_BUTTON),
                Click.on(MyStoreShoppingOrderPage.PAY_BY_BANK_BUTTON),
                Click.on(MyStoreShoppingOrderPage.CONFIRM_MY_ORDER_BUTTON)
        );
    }
}
