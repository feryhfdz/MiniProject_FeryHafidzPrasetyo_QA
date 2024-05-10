package starter.pages;

import net.serenitybdd.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class DeletePage extends PageObject {
    private By confirmationDeletePage(){
        return new By.ByXPath("//*[@id=\"root\"]/div/h1");
    }
    private By yesButton(){
        return new By.ByXPath("//*[@id=\"root\"]/div/div[2]/button");
    }

    @Step
    public boolean confirmationDeletePageDisplayed(){
        return $(confirmationDeletePage()).isDisplayed();
    }
    @Step
    public void clickYesButton(){
        $(yesButton()).click();
    }
}
