package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends PageBase{

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "FullName")
    WebElement fullNameTxtBox;

    @FindBy(id = "UserMobileNumber")
    WebElement mobileNumberTxtBox;

    @FindBy(id = "EmailAddress")
    WebElement emailTxtBox;

    @FindBy(id = "Password")
    WebElement passwordTxtBox;

    @FindBy(id = "submit-btn")
    WebElement submitButton;

    public void enterRegistrationData(String fullName , String mobileNumber , String email, String password){
        setTextElementText(fullNameTxtBox,fullName);
        setTextElementText(mobileNumberTxtBox,mobileNumber);
        setTextElementText(emailTxtBox,email);
        setTextElementText(passwordTxtBox,password);
    }

    public void submitRegistrationData(){
        clickButton(submitButton);
    }
}
