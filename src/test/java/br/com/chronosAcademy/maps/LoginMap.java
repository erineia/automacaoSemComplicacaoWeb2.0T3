package br.com.chronosAcademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {
    @FindBy(css = "#menuUserLink")
    public WebElement btnLogin;
    @FindBy(css = ".closeBtn")
    public WebElement btnFechar;
    @FindBy(css = ".PopUp")
    public WebElement divFecharModal;
    @FindBy(css = "*[name='username']")
    public WebElement inpUserName;
    @FindBy(css = "*[name='password']")
    public WebElement inpPassWord;
    @FindBy(css = "#sign_in_btnundefined")
    public WebElement btnSignIn;
    @FindBy(css = "*[name='remember_me']")
    public WebElement inpRemember;
    @FindBy(css = "*[class='create-new-account ng-scope']")
    public WebElement linkCreateAccout;
    @FindBy(css = ".loader")
    public WebElement divLoader;
    @FindBy(css = ".containMiniTitle")
    public WebElement txtLogado;
    @FindBy(xpath = "//label[contains(text(), 'Incorrect')]")
    public WebElement txtErrorLogin;

}
