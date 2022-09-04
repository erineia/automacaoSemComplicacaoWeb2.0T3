package br.com.chronosAcademy.pages;

import br.com.chronosAcademy.core.Driver;
import br.com.chronosAcademy.maps.MyAccoutMap;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
    MyAccoutMap myAccoutMap;

    public MyAccountPage() {
        myAccoutMap = new MyAccoutMap();
        PageFactory.initElements(Driver.getDriver(), myAccoutMap);

    }

    public void clickLinkUser() {
        Driver.visibilityOf(myAccoutMap.linkUser);
        myAccoutMap.linkUser.click();
    }

    public void clickLinkMyAccount() {
        Driver.visibilityOf(myAccoutMap.linkMyAccount);
        myAccoutMap.linkMyAccount.click();
    }

    public void clickLinkEdit() {
        Driver.visibilityOf(myAccoutMap.linkMyAccount);
        myAccoutMap.linkMyAccount.click();

    }

    public String getTextUsuario() {
        Driver.visibilityOf(myAccoutMap.linkEdit);
        return myAccoutMap.linkEdit.getText();

    }

    public void clickBtnDelete(){
        Driver.visibilityOf(myAccoutMap.btnDelete);
        myAccoutMap.btnDelete.click();

    }

    public void clickBtnYes(){
        Driver.visibilityOf(myAccoutMap.btnYes);
        myAccoutMap.btnYes.click();

    }
}
