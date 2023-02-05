package co.com.choucair.retoPractico01.Serenityweb.stepdefinitions;

import co.com.choucair.retoPractico01.Serenityweb.interactions.ClickCampos;
import co.com.choucair.retoPractico01.Serenityweb.interactions.SerenityDashboard;
import co.com.choucair.retoPractico01.Serenityweb.questions.VerificarMeeting;
import co.com.choucair.retoPractico01.Serenityweb.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class CrearReunionDefinitions {

    @Before
    public void inicarEscenario(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Aaron").wasAbleTo(AbrirBrowser2.urlApp());
        OnStage.theActorInTheSpotlight().wasAbleTo(Login2.loginUsuario());
    }

    @Given(": Aaron want to create a meeting in the SerenityWEB")
    public void aaron_want_to_create_a_meeting_in_the_serenity_web() {
        OnStage.theActorCalled("Aaron").wasAbleTo(SerenityDashboard.clickMeeting1());

    }

    @When(":He create the meeting on the SerenityWEB")
    public void he_create_the_meeting_on_the_serenity_web() {
        OnStage.theActorInTheSpotlight().wasAbleTo(CrearNuevaReunion.llenarCampos());
        OnStage.theActorInTheSpotlight().wasAbleTo(ClickCampos.llenarCampos());


    }

    @Then(": He verify that meeting was created correctly in the SerenityWEB")
    public void he_verify_that_meeting_was_created_correctly_in_the_serenity_web() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerificarMeeting.resultado(), Matchers.equalTo("Meetings")));
    }
}
