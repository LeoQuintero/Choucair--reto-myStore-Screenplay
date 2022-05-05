package co.com.choucair.certification.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MyStoreLoginPage extends PageObject {


    public static final Target LOGIN_BUTTON = Target.the("Botón que ingresa para la autentificación")
            .located(By.className("login"));
    public static final Target INPUT_EMAIL = Target.the("Campo para ingresar el email como username")
            .located(By.id("email"));
    public static final Target INPUT_PASSWORD = Target.the("Campo para ingresar la clave")
            .located(By.id("passwd"));
    public static final Target SIGN_IN_BUTTON = Target.the("Botón para enviar los datos de autenticación")
            .located(By.id("SubmitLogin"));
}
