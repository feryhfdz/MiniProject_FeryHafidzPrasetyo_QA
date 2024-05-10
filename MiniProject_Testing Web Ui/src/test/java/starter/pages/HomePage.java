package starter.pages;

import net.serenitybdd.annotations.Step;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private By title() {
        return new By.ByXPath("//*[@id=\"root\"]/div/div[2]/h1");
    }

    private By addNewBookButton() {
        return new By.ByXPath("//*[@id=\"root\"]/div/div[2]/a");
    }

    private By infoBookButton() {
        return new By.ByXPath("//*[@id=\"root\"]/div/table/tbody/tr[4]/td[5]/div/a[1]");
    }

    private By deleteBookButton() {
        return new By.ByXPath("//*[@id=\"root\"]/div/table/tbody/tr[6]/td[5]/div/a[3]");
    }

    private By editBookButton() {
        return new By.ByXPath("//*[@id=\"root\"]/div/table/tbody/tr[4]/td[5]/div/a[2]");
    }

    private By SuccessCreatedMessage() {
        return new By.ByXPath("//*[@id=\"notistack-snackbar\"]");
    }
    private By SuccessDeletedMessage(){
        return new By.ByXPath("//*[@id=\"root\"]/div[2]");
    }


    @Step
    public boolean validateOnLandingPage() {
        try {
            Thread.sleep(2100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return $(title()).isDisplayed();
    }
    public boolean backToLandingPage(){
        return $(title()).isDisplayed();
    }

    @Step
    public void clickAddNewButton() {
        $(addNewBookButton()).click();
    }

    @Step
    public void clickinfoBookButton() {
        $(infoBookButton()).click();
    }

    @Step
    public void clickDeleteBookButton() {
        $(deleteBookButton()).click();
    }

    @Step
    public void clickEditBookButton() {
        $(editBookButton()).click();
    }
    @Step
    public boolean successCreatedMessageDisplayed() {
        return $(SuccessCreatedMessage()).isDisplayed();
    }
    @Step
    public boolean successDeletedMessageDisplayed(){
        return $(SuccessDeletedMessage()).isDisplayed();
    }
}

