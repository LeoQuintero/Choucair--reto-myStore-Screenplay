package co.com.choucair.certification.questions;

import co.com.choucair.certification.userinterface.MyStoreShoppingOrderPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class VerificarCompra implements Question<Boolean> {
    private String question = "Your order on My Store is complete.";
    static boolean result;
    public static Question<Boolean> toThe() {
        return new VerificarCompra();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String orderConfirmation = MyStoreShoppingOrderPage.LBL_CONFIRMACION.resolveFor(actor).getText();
        if (question.equals(orderConfirmation)){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
