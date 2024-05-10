package starter.pages;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CreatePage extends PageObject {
    private By createBookPage(){
        return new By.ByXPath("//*[@id=\"root\"]/div/h1");
    }
    private By titleField(){
        return new By.ByXPath("//*[@id=\"title\"]");
    }
    private By authorField(){
        return new By.ByXPath("//*[@id=\"author\"]");
    }
    private By publishYearField(){
        return new By.ByXPath("//*[@id=\"publishYear\"]");
    }
    private By saveBookButton(){
        return new By.ByXPath("//*[@id=\"root\"]/div/div[2]/button");
    }
    private By errorMessage(){
        return new By.ByXPath("//*[@id=\"root\"]/div[2]/div");
    }

    @Step
    public boolean OnCreateBookPage(){
        return $(createBookPage()).isDisplayed();
    }

    @Step
    public void ValidInputTitle(String title){
        $(titleField()).type(title);
    }
    @Step
    public void ValidInputAuthor(String author){
        $(authorField()).type(author);
    }
    @Step
    public void ValidInputPublishYear(String publishYear){
        $(publishYearField()).type(publishYear);
    }
    @Step
    public void clickSaveBookButton(){
        $(saveBookButton()).click();
    }
    @Step
    public boolean inputEmptyTitleField(){
        return $(titleField()).isDisplayed();
    }
    @Step
    public boolean inputEmptyAuthorField(){
        return $(authorField()).isDisplayed();
    }
    @Step
    public boolean inputEmptyPublishYearField(){
        return $(publishYearField()).isDisplayed();
    }
    @Step
    public boolean errorMessageDisplay(){
        return $(errorMessage()).isDisplayed();
    }
}
