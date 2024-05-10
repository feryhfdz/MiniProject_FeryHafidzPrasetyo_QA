package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class InfoPage extends PageObject {
    private By showBookPage(){
        return new By.ByXPath("//*[@id=\"root\"]/div/h1");
    }
    private By SuccessEditMessage(){
        return new By.ByXPath("//*[@id=\"root\"]/div[2]");
    }

    @Step
    public boolean showBookPageDisplayed() { return $(showBookPage()).isDisplayed();
    }
    @Step
    public boolean successEditMessageDisplayed(){
        return $(SuccessEditMessage()).isDisplayed();
    }
}
