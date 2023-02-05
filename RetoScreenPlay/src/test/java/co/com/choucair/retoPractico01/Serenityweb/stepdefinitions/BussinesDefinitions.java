package co.com.choucair.retoPractico01.Serenityweb.stepdefinitions;

import co.com.choucair.retoPractico01.Serenityweb.interactions.BotonSaveBussinessUnit;
import co.com.choucair.retoPractico01.Serenityweb.interactions.SearchProfeatures;
import co.com.choucair.retoPractico01.Serenityweb.questions.VerifyCreatedBussinessUnit;
import co.com.choucair.retoPractico01.Serenityweb.tasks.AbrirBrowser;
import co.com.choucair.retoPractico01.Serenityweb.interactions.BotonCrearBussinessUnit;
import co.com.choucair.retoPractico01.Serenityweb.tasks.CrearBussinessUnit;
import co.com.choucair.retoPractico01.Serenityweb.tasks.Login;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class BussinesDefinitions {

    @Before
    public void abrir_Navegador_y_HacerLogin(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Aaron").wasAbleTo(AbrirBrowser.urlApp());
        OnStage.theActorInTheSpotlight().wasAbleTo(Login.loginUsuario());
    }

    @Given(": Aaron search in ProFeatures for a Business Unit")
    public void aaronSearchInProFeaturesForABusinessUnit() {
        OnStage.theActorCalled("Aaron").attemptsTo(SearchProfeatures.selectBusinessUnit());
    }
    @When(": he created a new  Bussines Unit")
    public void heCreatedANewBussinesUnit() {
    OnStage.theActorInTheSpotlight().attemptsTo(BotonCrearBussinessUnit.crearNueva());
    }
    @When(": fill the camps to created a new one")
    public void fillTheCampsToCreatedANewOne() {
        OnStage.theActorInTheSpotlight().attemptsTo(CrearBussinessUnit.llenarCampos());
        OnStage.theActorInTheSpotlight().attemptsTo(BotonSaveBussinessUnit.guardarCampos());
    }
    @Then(": i would see the new bussines unit created in the table")
    public void iWouldSeeTheNewBussinesUnitCreatedInTheTable() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyCreatedBussinessUnit.resultado(), Matchers.equalTo("Business Units")));
    }

}
