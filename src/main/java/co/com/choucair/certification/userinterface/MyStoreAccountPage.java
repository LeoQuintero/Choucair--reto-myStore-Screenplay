package co.com.choucair.certification.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MyStoreAccountPage extends PageObject {

    public static final Target LBL_USER_NAME = Target.the("texto nombre del usuario")
            .located(By.xpath("//*[@id='header']/div[2]/div/div/nav/div[1]"));

    public static final Target WOMAN_NAV_BUTTON = Target.the("Sección Woman del navegador ")
            .located(By.xpath("//*[@id='block_top_menu']/ul/li[1]/a"));

    public static final Target DRESS_ITEM = Target.the("item de producto para vestido")
            .located(By.xpath("//*[@id='center_column']/ul/li[4]/div/div[2]/h5/a"));

    public static final Target SIZE_LIST = Target.the("lista de tallas")
            .located(By.id("group_1"));
}
