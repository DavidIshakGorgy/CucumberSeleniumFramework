package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends PageBase{

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "MobileNumber")
    WebElement mobileNumberOrEmailTxtBox;
    @FindBy(id = "Password")
    WebElement passwordTxtBox;
    @FindBy(id = "loginbutton")
    WebElement loginBtn;

    public void signIn(String mobilNumberOrEmail , String password){
        setTextElementText(mobileNumberOrEmailTxtBox,mobilNumberOrEmail);
        setTextElementText(passwordTxtBox,password);
        clickButton(loginBtn);
    }
}
