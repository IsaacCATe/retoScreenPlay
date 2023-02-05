package co.com.choucair.retoPractico01.Serenityweb.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
        tags = "@bussinessUnit or @ScheduleMeeting",
        glue = "co.com.choucair.retoPractico01.Serenityweb.stepdefinitions",
        snippets = CAMELCASE)
public class RunnerTag {
}
