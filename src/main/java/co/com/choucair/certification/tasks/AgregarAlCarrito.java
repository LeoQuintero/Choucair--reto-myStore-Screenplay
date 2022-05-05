package co.com.choucair.certification.tasks;

import co.com.choucair.certification.userinterface.MyStoreAccountPage;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class AgregarAlCarrito implements Task {
    private String size;

    public AgregarAlCarrito(String size) {
        this.size = size;
    }

    public static AgregarAlCarrito producto() {
        return Instrumented
                .instanceOf(AgregarAlCarrito.class)
                .withProperties("M");
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MyStoreAccountPage.WOMAN_NAV_BUTTON),
                Click.on(MyStoreAccountPage.DRESS_ITEM),
                Click.on(MyStoreAccountPage.SIZE_LIST),
                SelectFromOptions.byVisibleText(size).from(MyStoreAccountPage.SIZE_LIST) // seleccionar de la lista

        );

    }
}
