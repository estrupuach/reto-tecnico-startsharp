package co.com.reto.tecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    public static final Target INPUT_USERNAME = Target.the("Input from write the username")
            .located(By.id("StartSharp_Membership_LoginPanel0_Username"));
    public static final Target INPUT_PASSWORD = Target.the("Input from write the password")
            .located(By.id("StartSharp_Membership_LoginPanel0_Password"));;
    public static final Target ENTER_BUTTON = Target.the("button from get into to page")
            .located(By.id("StartSharp_Membership_LoginPanel0_LoginButton"));;
}
