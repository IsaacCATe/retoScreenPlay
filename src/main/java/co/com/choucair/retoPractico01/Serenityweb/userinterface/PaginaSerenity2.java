package co.com.choucair.retoPractico01.Serenityweb.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demo.serenity.is/Account/Login/?ReturnUrl=%2F")
public class PaginaSerenity2 extends PageObject {

    public static final Target botonLogin = Target.the("Boton Login").located(By.xpath("//*[@id=\"LoginPanel0_LoginButton\"]"));
    public static final Target clickMeetingDashboard = Target.the("Boton DashMeeting").located(By.xpath("//*[@id=\"nav_menu1_3\"]/li[2]/a/span"));
    public static final Target clickInMeetingBoard = Target.the("Boton MeetingBoard").located(By.xpath("//*[@id=\"nav_menu1_3_2\"]/li[1]/a/span"));
    public static final Target clickInNewMeeting = Target.the("Boton MeetingBoard").located(By.xpath("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]/div/span"));
    public static final Target meetingName = Target.the("Meeting Name").located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_MeetingName\"]"));
    public static final Target botonMeetingType = Target.the("Boton MeetingType").located(By.xpath("//*[@id=\"s2id_Serenity_Pro_Meeting_MeetingDialog10_MeetingTypeId\"]/a/abbr"));
    public static final Target botonSelectMeetingType = Target.the("Boton SelectMeetingType").locatedByFirstMatching("//*[@id=\"s2id_Serenity_Pro_Meeting_MeetingDialog10_MeetingTypeId\"]/a/span[2]");
    public static final Target MeetingType = Target.the("Board of Directors").locatedBy("//*[@id=\"select2-results-6\"]/li[1]");
    //Calendario StarDate
    public static final Target botonCalendario = Target.the("Boton Celendario").locatedBy("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid\"]/div/div/div[4]/button/i");
    public static final Target botonCalendarioMeses = Target.the("Boton CelendarioMes").locatedBy("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[1]");
    public static final Target botonCalendarioSelectMes = Target.the("Boton CelendarioMes").locatedBy("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[1]/option[6]");
    public static final Target botonCalendarioSelectJunio= Target.the("Boton junio").locatedBy("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[3]/a");
    //FIN
    public static final Target botonSelectLocation= Target.the("Boton Select location").locatedBy("//*[@id=\"s2id_Serenity_Pro_Meeting_MeetingDialog10_LocationId\"]/a");
    public static final Target botonLocation= Target.the("Boton location").locatedBy("//*[@id=\"select2-results-7\"]/li[5]");
    public static final Target botonSelectOrganizedBy= Target.the("Boton Select Organizefd").locatedBy("//*[@id=\"s2id_Serenity_Pro_Meeting_MeetingDialog10_OrganizerContactId\"]/a");
    public static final Target botonOrganizedBy= Target.the("Boton Organized").locatedBy("//*[@id=\"select2-results-9\"]/li[6]");
    public static final Target meetingNumber = Target.the("Boton MeetingType").located(By.xpath("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_MeetingNumber\"]"));
    //Calendario Final Date
    public static final Target botonCalendario2 = Target.the("Boton Celendario2").locatedBy("//*[@id=\"Serenity_Pro_Meeting_MeetingDialog10_PropertyGrid\"]/div/div/div[5]/button/i");
    public static final Target botonCalendarioMeses2 = Target.the("Boton CelendarioMes2").locatedBy("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[1]");
    public static final Target botonCalendarioSelectMes2 = Target.the("Boton CelendarioMes2").locatedBy("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[1]/option[7]");
    public static final Target botonCalendarioSelectJulio = Target.the("Boton julio").locatedBy("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[2]/a");
    //FIN
    public static final Target botonUnit = Target.the("Boton Unit").locatedBy("//*[@id=\"s2id_Serenity_Pro_Meeting_MeetingDialog10_UnitId\"]/a");
    public static final Target botonSelectUnit = Target.the("Boton Unit").locatedBy("//*[@id=\"select2-results-8\"]/li[4]");
    public static final Target botonReporter = Target.the("Boton Reporter").locatedBy("//*[@id=\"s2id_Serenity_Pro_Meeting_MeetingDialog10_ReporterContactId\"]/a");
    public static final Target botonSelectReporter = Target.the("Boton SelectReporter").locatedBy("//*[@id=\"select2-results-10\"]/li[28]\n");
    public static final Target botonAddContact = Target.the("Boton AddContac").locatedBy("//*[@id=\"s2id_autogen11\"]/a\n");
    public static final Target botonSelectContact = Target.the("Boton SelectContact1").locatedBy("//*[@id=\"select2-results-12\"]/li[1]");

    public static final Target botonAddContact2 = Target.the("Boton AddContac").locatedBy("//*[@id=\"s2id_autogen11\"]/a\n");
    public static final Target BotonSelectContact2 = Target.the("Boton SelectContact2").locatedBy("//*[@id=\"select2-results-12\"]/li[2]");
    public static final Target BotonSaveReunion = Target.the("Boton SaveMeeting").locatedBy("//*[@class=\"fa fa-check-circle text-purple\"]");
    //Question
    public static final Target leerMeetings = Target.the("Leer Meetings").locatedBy("//*[@id=\"GridDiv\"]/div[1]/div");

}
