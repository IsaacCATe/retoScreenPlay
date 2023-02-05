package co.com.choucair.retoPractico01.Serenityweb.interactions;

import co.com.choucair.retoPractico01.Serenityweb.userinterface.PaginaSerenity2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SerenityDashboard implements Interaction {

    public static SerenityDashboard clickMeeting1() {
        return Tasks.instrumented(SerenityDashboard.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaSerenity2.clickMeetingDashboard));
        actor.attemptsTo(Click.on(PaginaSerenity2.clickInMeetingBoard));
        actor.attemptsTo(Click.on(PaginaSerenity2.clickInNewMeeting));
    }
}
