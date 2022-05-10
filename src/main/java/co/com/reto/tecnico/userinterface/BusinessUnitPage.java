package co.com.reto.tecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BusinessUnitPage extends PageObject {
    public static final Target LIST_ORGABIZATION = Target.the("deyployment the organization list").
            located(By.cssSelector("a[href='#nav_menu1_3_1']"));
    public static final Target OPTION_BUSINESS_UNIT = Target.the("enter session business unit").
            located(By.cssSelector("a[href='/demo/Organization/BusinessUnit']"));
    public static final Target BUTTON_NEW_BUSINESS_UNIT = Target.the("show form that create new business").
            located(By.xpath("//span[text()=' New Business Unit']"));
    public static final Target INPUT_NAMEBUSINESS = Target.the("Here write name of new business").
            located(By.cssSelector("input[name='Name']"));
    public static final Target OPEN_LIST_PARENT_UNIT = Target.the("open the list the parents units").
            located(By.cssSelector("a[href='javascript:void(0)']"));
    public static final Target INPUT_PARENTTYPE = Target.the("Here write name of parent type business").
            located(By.xpath("(//input[@type='text'])[6]"));
    public static final Target BUTTON_SAVE = Target.the("save the new business van").
            located(By.xpath("//span[text()=' Save']"));

}
