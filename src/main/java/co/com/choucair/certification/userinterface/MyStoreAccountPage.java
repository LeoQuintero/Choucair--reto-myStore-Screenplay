package co.com.choucair.certification.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MyStoreAccountPage extends PageObject {

    public static final Target LBL_USER_NAME = Target.the("texto nombre del usuario")
            .located(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]"));


}
