package co.com.choucair.certification.questions;

import co.com.choucair.certification.userinterface.MyStoreAccountPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.certification.userinterface.MyStoreAccountPage.LBL_USER_NAME;

public class Verificar implements Question {

    private final String question;

    public Verificar(String question) {
        this.question = question;
    }

    public static Verificar toThe(String question) {
        return new Verificar(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
//        return Text.of(MyStoreAccountPage.LBL_USER_NAME).viewedBy(actor).asString();
        String nameUser = LBL_USER_NAME.resolveFor(actor).getText();
        if(question.equals(nameUser)){
            result = true;
        }else{
            result = false;
        }
        return result;





    }
}
