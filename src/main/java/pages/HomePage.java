package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class HomePage extends PageBase {

    public HomePage(WebDriver driver) {

        super(driver);
    }

    @FindBy(css = ".signuptext.white.fs-12.mobile-nowrap")
    WebElement signUpBtn;

    @FindBy(id = "PatientNamePlaceHolder")
    WebElement patientDetailsBtn;

    @FindBy(xpath = "//ul[@id = 'hdrMenuDropdown']//li")
    List<WebElement> patientDetailsDropDownContent;

    @FindBy(xpath = "//a[@class='white fs-12']")
    WebElement signInBtn;


    public void openRegistrationPage(){
        clickButton(signUpBtn);
    }

    public String getPatientName(){
        String pName = patientDetailsBtn.getText();
        return pName;
    }

    public void openPatientDetailsDropDown(){
        clickButton(patientDetailsBtn);
    }

    public void signOut(){
        List<WebElement> dropDown= patientDetailsDropDownContent;
        for(int i=0 ; i < dropDown.size() ; i++){
            if(dropDown.get(i).findElement(By.tagName("a")).getAttribute("href").contains("SignOut")){
                dropDown.get(i).click();
            }
        }
    }


    public void openSignInPage(){
        clickButton(signInBtn);
    }

    public void waitUntilPatientDetailsBtnIsVisible(){
        waitUntilElementIsVisible(patientDetailsBtn);
    }

}
