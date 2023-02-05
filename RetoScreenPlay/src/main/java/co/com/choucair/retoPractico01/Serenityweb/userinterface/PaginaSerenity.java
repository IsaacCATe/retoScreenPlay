package co.com.choucair.retoPractico01.Serenityweb.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demo.serenity.is/Account/Login/?ReturnUrl=%2F")

public class PaginaSerenity extends PageObject {
    public static final Target botonLogin = Target.the("Boton Login").located(By.xpath("//*[@id=\"LoginPanel0_LoginButton\"]"));
    public static final Target botonOrganization= Target.the("boton organization").locatedBy("//*[@id=\"nav_menu1_3\"]/li[1]/a ");
    public static final Target botonBussinesUnits= Target.the("boton oBUsiinesUnits").locatedBy("//*[@id=\"nav_menu1_3_1\"]/li[1]/a");
    public static final Target botonNewBusinessUnit= Target.the("boton new Bussines unit").locatedBy("//*[@id=\"GridDiv\"]/div[2]/div[2]/div/div/div[1]/div/span/i");
    public static final Target inputOrganizationValue= Target.the("input value").locatedBy("//*[@id=\"Serenity_Pro_Organization_BusinessUnitDialog3_Name\"]");
    public static final Target botonParentUnit= Target.the("Parent Unir ").locatedBy("//*[@id=\"s2id_Serenity_Pro_Organization_BusinessUnitDialog3_ParentUnitId\"]/a");
    public static final Target botonSelectParentUnit= Target.the("botonSelectOrganization ").locatedBy("//*[@id=\"select2-results-1\"]/li[4]");
    public static final Target botonSaveParentUnit= Target.the("botonSaveOrganization ").locatedBy("//*[@id=\"Serenity_Pro_Organization_BusinessUnitDialog3_Toolbar\"]/div/div/div/div[1]/div/span/i ");
    public static final Target txtoNewBussinesUnit = Target.the("texto newBussinesUnit").located(By.xpath("//*[@id=\"GridDiv\"]/div[1]/div"));

}
