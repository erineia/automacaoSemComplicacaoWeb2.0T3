package br.com.chronosAcademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAccountMap {
    @FindBy(css = ".fixedImportant")
   public WebElement txtCreateNewAccount;
    @FindBy(name = "usernameRegisterPage")
    public WebElement inpUserName;
    @FindBy(name = "emailRegisterPage")
    public WebElement inpEmail;
    @FindBy(name = "passwordRegisterPage")
    public WebElement inpPassword;
    @FindBy(name = "confirm_passwordRegisterPage")
    public WebElement inpConfirmPassword;
    @FindBy(name = "countryListboxRegisterPage")
    public WebElement slcCountry;
    @FindBy(name = "i_agree")
    public WebElement inpIngree;
    @FindBy(css = "#register_btnundefined")
    public WebElement btnRegister;
;
}
