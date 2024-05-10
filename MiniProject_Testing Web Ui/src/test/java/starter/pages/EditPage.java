package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class EditPage extends PageObject {
    private By editBookPage(){
        return new By.ByXPath("//*[@id=\"root\"]/div/div[2]");
    }

    private By titleFieldEdit(){
        return new By.ByXPath("//*[@id=\"title\"]");
    }

    private By authorFieldEdit(){
        return new By.ByXPath("//*[@id=\"author\"]");
    }

    private By publishYearFieldEdit(){
        return new By.ByXPath("//*[@id=\"publishYear\"]");
    }
    private By editButton(){
        return new By.ByXPath("//*[@id=\"root\"]/div/div[2]/button");
    }
    private By errorMessageEdit(){
        return new By.ByXPath("//*[@id=\"root\"]/div[2]");
    }

    @Step
    public boolean onEditBookPage(){
        return $(editBookPage()).isDisplayed();
    }

    @Step
    public void inputTitleEdit(String title){
        $(titleFieldEdit()).type(title);
    }

    @Step
    public void inputAuthorEdit(String author){
        $(authorFieldEdit()).type(author);
    }

    @Step
    public void inputPublishYearEdit(String publishYear){
        $(publishYearFieldEdit()).type(publishYear);
    }

    @Step
    public void clickEditButton(){
        $(editButton()).click();
    }
    @Step
    public void inputEmptyTitleFieldEdit(String title){
        $(titleFieldEdit()).type(title);
    }
    @Step
    public void inputEmptyAuthorFieldEdit(String author){
        $(authorFieldEdit()).type(author);
    }
    @Step
    public void inputEmptyPublishYearFieldEdit(String publishYear){
        $(publishYearFieldEdit()).type(publishYear);
    }

    @Step
    public boolean errorMessageEditDisplayed(){
        return $(errorMessageEdit()).isDisplayed();
    }
}
