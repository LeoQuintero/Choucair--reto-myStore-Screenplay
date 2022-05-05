package co.com.choucair.certification.tasks;

import co.com.choucair.certification.userinterface.MyStoreLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class IniciarSesion implements Task {

    private final String usuario;
    private final String clave;

    public IniciarSesion(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }
    public static IniciarSesion credenciales(String usuario, String clave) {
        return Tasks.instrumented(IniciarSesion.class, usuario, clave);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MyStoreLoginPage.LOGIN_BUTTON),
                Enter.theValue(usuario).into(MyStoreLoginPage.INPUT_EMAIL),
                Enter.theValue(clave).into(MyStoreLoginPage.INPUT_PASSWORD),
                Click.on(MyStoreLoginPage.SIGN_IN_BUTTON)
        );

    }
}
