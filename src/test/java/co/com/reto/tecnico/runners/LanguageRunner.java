package co.com.reto.tecnico.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/language.feature",
        tags = "@portuguese",
        glue = "co.com.reto.tecnico",
        snippets = SnippetType.CAMELCASE )

public class LanguageRunner {
}