package steps;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.TrendPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TrendyolStepDefs {

    TrendPage tp = new TrendPage();

    @Given("launch the {string} mobile app")
    public void launchTheMobileApp(String arg0) {
        Driver.getAppiumDriver();
    }

    @Then("tap gender button")
    public void tapGenderButton() {
        tp.erkekButtonClick();
        ReusableMethods.bekle(2);
        tp.kesfetKapatClick();
    }

    @Then("tap account tab")
    public void tapAccountTab() {
        tp.accountTabClick();
        tp.cancelDefaultAccountClick();
    }

    @Then("enter email in the {string} field")
    public void enterEmailInTheField(String arg0) {
        //ReusableMethods.bekle(1);
        tp.cancelDefaultAccountClick();
        tp.emailTextBox("write a valid e-mail");
    }

    @Then("enter password in the {string} field")
    public void enterPasswordInTheField(String arg0) {
        tp.passwordTextBox("write a valid password");}

    @Then("tap the {string} button")
    public void tapTheButton(String arg0) {

        //Driver.getAppiumDriver().navigate().back();
    }


    @Then("tap {string} tab")
    public void tapTab(String inputText) {
        if (inputText.equals("anasayfa")) {
            Driver.getAppiumDriver().navigate().back();
            tp.anasayfaTabClick();
            //Driver.getAppiumDriver().navigate().back();}
        }
        if (inputText.equals("sepetim")){
            tp.sepetimTabClick();
            ReusableMethods.bekle(2);
            Driver.getAppiumDriver().navigate().back();
            }

    }

    @Then("tap {string}")
    public void tap(String str) {
        //Driver.getAppiumDriver().navigate().back();
        if (str.equals("search")) {
            tp.kesfetKapatClick();
            tp.searchContainerClick();
        }
        if (str.equals("sepetim")) {
            tp.closeSepetUyariClick();
            tp.sepetimTabClick();
        }

    }

    @Then("search {string}")
    public void search(String arg0) {
        tp.searchTextBox(ConfigReader.getProperty("arananUrun"));
        ReusableMethods.bekle(1);
        tp.suggestTextClick();
        ReusableMethods.bekle(4);
        ///ReusableMethods.scrollDownByCoordinates(540,540,1400,500);;
    }

    @Then("add first product to the cart")
    public void addFirstProductToTheCart() {


    }

    @Then("tap {string} button")
    public void tapButton(String input) {
        if (input.equals("erkek")) {tp.erkekButtonClick();}
        if (input.equals("sepeti onayla")) {
            tp.kesfetKapatClick();
            tp.sepetiOnaylaClick();}

        if ( input.equals("kaydet")) {
            ReusableMethods.bekle(2);
            tp.kaydetButton.click();
        }
        if (input.equals("Giris Yap")) {
            tp.girisYapButtonClick();
            ReusableMethods.bekle(2);
        }
        if (input.equals("sepeti Onayla")) {
            tp.sepetiOnaylaClick();
        }

        //ReusableMethods.bekle(2);
        //Driver.getAppiumDriver().navigate().back();
        //tp.sepetiOnaylaClick();
    }

    @Then("enter credit card number")
    public void enterCreditCardNumber() {

        tp.krediKartBox(ConfigReader.getProperty("cardNumber"));
        Driver.getAppiumDriver().hideKeyboard();

    }

    @Then("tap {string} link")
    public void tapLink(String text) {
        if (text.equals("Ekle/Düzenle") ) {
            //Driver.getAppiumDriver().navigate().back();
            tp.gelAlIptal.click();
            ReusableMethods.bekle(1);
            tp.adresEkleLink.click();
        }
        if (text.equals("Adres Ekle")) {
            tp.yeniAdresEkleLink.click();
        }
    }

    @Then("enter {string}")
    public void enter(String input) {

            tp.adresIsimBox.sendKeys("Ahmet");
            tp.adresSoyAdBox.sendKeys("Akpunar");
            tp.adresTlfBox.sendKeys("05424236929");
            //Sehir seç
            tp.adresSehirClick.click();
            tp.adresSehirSendKeys.sendKeys("Elazığ");
            tp.adresSehirSec.click();
            //İlçe
            //tp.adresIlceClick.click();
            tp.adresIlceSendKeys.sendKeys("Merkez");
            tp.adresIlceSec.click();
            //Mahalle
            //tp.adressMahalleClick.click();
            tp.adresMahalleSendKeys.sendKeys("Ataşehir Mah");
            tp.adresMahalleSec.click();
            //ReusableMethods.scrollDownByCoordinates(540,540,1400,500);
            //Tam Adres gir
            //tp.tamAdresClick.click();
            //ReusableMethods.bekle(1);
            tp.tamAdresClick.sendKeys("Güneykent TOKI D BLok No:5");
            Driver.getAppiumDriver().hideKeyboard();
            ReusableMethods.scrollDownByCoordinates(540,540,1400,500);

            tp.adresBaslikClick.sendKeys("Ev");
            Driver.getAppiumDriver().hideKeyboard();
            //tp.adresBaslikSendKeys.sendKeys("Ev");


    }

    @Then("tap to the {string} button")
    public void tapToTheButton(String input) {
        //ReusableMethods.scrollDownByCoordinates(540,540,1400,500);



    }


    @Then("enter valid {string} info")
    public void enterValidInfo(String arg0) {
        ReusableMethods.bekle(4);
        ReusableMethods.scrollDownByCoordinates(540,540,1400,400);
        //ReusableMethods.bekle(1);
        tp.cardNumber.sendKeys(ConfigReader.getProperty("cardNumber"));
        tp.cardNumberMonthBox.click();
        tp.cardNumberMonth.click();

        //tp.cardNumberYearBox.click();
        tp.cardNumberYear.click();
        tp.cvcBox.sendKeys(ConfigReader.getProperty("cvcNumber"));

        //3D ödeme checkbox
        //tp.threeDOdeme.click();
        ReusableMethods.scrollDownByCoordinates(540,540,1600,400);
        ReusableMethods.bekle(2);
        //tp.sozlesmeKabulCheckBox.click();

    }


    @Then("accept conditions")
    public void acceptConditions() {
        tp.sozlesmeKabulCheckBox.click();
    }

    @And("close the application")
    public void closeTheApplication() {
        Driver.getAppiumDriver().quit();
    }

    @Then("add first product to cart")
    public void addFirstProductToCart() {
        ReusableMethods.scrollDownByCoordinates(540,540,1400,500);
        tp.logitech.click();
        ReusableMethods.bekle(2);
        //closeSepetUyari.click();
        //tp.sepeteEkleButtonClick();
    }


}
