package br.com.chronosAcademy.maps;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccoutMap {

    @FindBy(css = "#menuUserLink")
    public WebElement linkUser;
    @FindBy(css = "#loginMobileMiniTitle > label[translate='My_account']")
    public WebElement linkMyAccount;
    @FindBy(css = "a[href='#/accountDetails']")
    public WebElement linkEdit;
    @FindBy(xpath = "//*[@id='myAccountContainer']/div[1]/div/div[1]/label")
    public WebElement txtUsuario;
    @FindBy(css = "deleteMainBtnContainer")
    public WebElement btnDelete;
    @FindBy(css = "deleteRed")
    public WebElement btnYes;

}
