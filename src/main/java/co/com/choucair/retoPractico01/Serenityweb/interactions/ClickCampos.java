package co.com.choucair.retoPractico01.Serenityweb.interactions;

import co.com.choucair.retoPractico01.Serenityweb.userinterface.PaginaSerenity2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ClickCampos implements Interaction {


    public static ClickCampos llenarCampos() {
        return Tasks.instrumented(ClickCampos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaSerenity2.botonMeetingType));
        actor.attemptsTo(Click.on(PaginaSerenity2.botonSelectMeetingType));
        actor.attemptsTo(Click.on(PaginaSerenity2.MeetingType));
        //Calendaio 1
        actor.attemptsTo(Click.on(PaginaSerenity2.botonCalendario));
        actor.attemptsTo(Click.on(PaginaSerenity2.botonCalendarioMeses));
        actor.attemptsTo(Click.on(PaginaSerenity2.botonCalendarioSelectMes));
        actor.attemptsTo(Click.on(PaginaSerenity2.botonCalendarioSelectJunio));
        //Fin calendario
        actor.attemptsTo(Click.on(PaginaSerenity2.botonSelectLocation));
        actor.attemptsTo(Click.on(PaginaSerenity2.botonLocation));
        actor.attemptsTo(Click.on(PaginaSerenity2.botonSelectOrganizedBy));
        actor.attemptsTo(Click.on(PaginaSerenity2.botonOrganizedBy));
        //Calendario 2
        actor.attemptsTo(Click.on(PaginaSerenity2.botonCalendario2));
        actor.attemptsTo(Click.on(PaginaSerenity2.botonCalendarioMeses2));
        actor.attemptsTo(Click.on(PaginaSerenity2.botonCalendarioSelectMes2));
        actor.attemptsTo(Click.on(PaginaSerenity2.botonCalendarioSelectJulio));
        //Fin calendario2
        actor.attemptsTo(Click.on(PaginaSerenity2.botonUnit));
        actor.attemptsTo(Click.on(PaginaSerenity2.botonSelectUnit));
        actor.attemptsTo(Click.on(PaginaSerenity2.botonReporter));
        actor.attemptsTo(Click.on(PaginaSerenity2.botonSelectReporter));
        //añadir Contacto
        actor.attemptsTo(Click.on(PaginaSerenity2.botonAddContact));
        actor.attemptsTo(Click.on(PaginaSerenity2.botonSelectContact));
        actor.attemptsTo(Click.on(PaginaSerenity2.botonAddContact2));
        actor.attemptsTo(Click.on(PaginaSerenity2.BotonSelectContact2));
        //Save
        actor.attemptsTo(Click.on(PaginaSerenity2.BotonSaveReunion));

    }
}
