package co.com.choucair.certification.mystore.runners;



import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/feature/myStore.feature",
        tags = "@HistoriaDeUsuario",
        glue = "co/com/choucair/certification/mystore/stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class RunnerTags {
}

