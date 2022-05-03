package co.com.choucair.certification.mystore.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/driver/chromedriver.exe",
        tags = "@HistoriaDeUsuario",
        glue = "co/com/choucair/certification/mystore/stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class RunnerTags {
}

