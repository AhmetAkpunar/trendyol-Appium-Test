package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;

import static io.appium.java_client.touch.WaitOptions.waitOptions;

public class TrendPage {
    public TrendPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAppiumDriver(), Duration.ofSeconds(15)),this);
    }

    AndroidDriver<AndroidElement> driver = (AndroidDriver)Driver.getAppiumDriver();
    TouchAction touchAction;

    @FindBy(id = "trendyol.com:id/buttonSelectGenderMan")
    private MobileElement erkekButton;

    @FindBy(id = "trendyol.com:id/imageViewTooltipClose")
    private MobileElement kesfetKapat;

    @FindBy(id = "android:id/content")
    private MobileElement contentClick;

    @FindBy(id = "trendyol.com:id/tab_account")
    private MobileElement hesabimTab;
    @FindBy(id = "com.google.android.gms:id/cancel")
    private MobileElement defaultAccount;

    @FindBy(id = "trendyol.com:id/editTextEmail")
    private MobileElement emailText;

    @FindBy(id = "trendyol.com:id/editTextPassword")
    private MobileElement passwordText;
    @FindBy(id = "trendyol.com:id/buttonLogin")
    private MobileElement girisYapButton;
    @FindBy(id = "trendyol.com:id/tab_home")
    private MobileElement anaysayfaTab;
    @FindBy(id = "trendyol.com:id/search_view_inner_container")
    private MobileElement searchContainer;
    @FindBy(id = "trendyol.com:id/edittext_search_view")
    private MobileElement searchTextBox;
    @FindBy(id = "trendyol.com:id/textViewSearchSuggestionText")
    private MobileElement suggestedText;
    @FindBy(xpath = "(//*[@text='Sepete Ekle'])[1]")
    private MobileElement sepeteEkleButton;
    @FindBy(id = "trendyol.com:id/imageViewTooltipClose")
    private MobileElement closeSepetUyari;
    @FindBy(id = "trendyol.com:id/tab_basket")
    private MobileElement sepetimTab;
    @FindBy(xpath = "(//*[contains(@text,'Sepete')])[1]")
    public MobileElement logitech;
    @FindBy(id = "trendyol.com:id/buttonApproveBasket")
    public MobileElement sepetiOnayla;
    @FindBy(id = "trendyol.com:id/editTextPaymentCardInformationCardNumber")
    public MobileElement cardNumber;

    @FindBy(id = "trendyol.com:id/textViewPaymentCardInformationMonth")
    public MobileElement cardNumberMonthBox;

    @FindBy(xpath = "//*[@text='05']")
    public MobileElement cardNumberMonth;


    @FindBy(id = "trendyol.com:id/textViewPaymentCardInformationYear")
    public MobileElement cardNumberYearBox;

    @FindBy(xpath = "//*[@text='2027']")
    public MobileElement cardNumberYear;

    @FindBy(id = "trendyol.com:id/editTextPaymentCardInformationCVV")
    public MobileElement cvcBox;

    @FindBy(id = "trendyol.com:id/checkboxOptionalThreeDSelection")
    public MobileElement threeDOdeme;

    @FindBy(id = "trendyol.com:id/checkbox")
    public MobileElement sozlesmeKabulCheckBox;

    @FindBy(id = "trendyol.com:id/buttonPaymentSubmit")
    private MobileElement onaylaBitirButton;
    @FindBy(id = "trendyol.com:id/textViewPaymentAddEditDeliveryAddress")
    public MobileElement adresEkleLink;
    @FindBy(id = "trendyol.com:id/textRightUp")
    public MobileElement yeniAdresEkleLink;

    ///Adres bilgileri sayfası
    @FindBy(id = "trendyol.com:id/editTextOwnerName")
    public MobileElement adresIsimBox;
    @FindBy(id = "trendyol.com:id/editTextOwnerSurname")
    public MobileElement adresSoyAdBox;
    @FindBy(id = "trendyol.com:id/editTextPhoneNumber")
    public MobileElement adresTlfBox;

    //İl seçimi
    @FindBy(id = "trendyol.com:id/editTextCity")
    public MobileElement adresSehirClick;
    @FindBy(id = "trendyol.com:id/editTextSearchLocation")
    public MobileElement adresSehirSendKeys;
    @FindBy(id = "trendyol.com:id/textViewLocationName")
    public MobileElement adresSehirSec;

    //İlçe Seçimi
    @FindBy(id = "trendyol.com:id/editTextDistrict")
    public MobileElement adresIlceClick;
    @FindBy(id = "trendyol.com:id/editTextSearchLocation")
    public MobileElement adresIlceSendKeys;
    @FindBy(id = "trendyol.com:id/textViewLocationName")
    public MobileElement adresIlceSec;


    //Mahalle Seçimi
    @FindBy(id = "trendyol.com:id/editTextNeighborhood")
    public MobileElement adressMahalleClick;
    @FindBy(id = "trendyol.com:id/editTextSearchLocation")
    public MobileElement adresMahalleSendKeys;
    @FindBy(id = "trendyol.com:id/textViewLocationName")
    public MobileElement adresMahalleSec;

    //Tam adress
    @FindBy(id = "trendyol.com:id/editTextAddress")
    public MobileElement tamAdresClick;

    @FindBy(id = "trendyol.com:id/textinput_placeholder")
    public MobileElement tamAdresSendKeys;
    // @FindBy(xpath = "hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.TextView")
    //public Mobile Element tamAdresSendKeys

    //Adres Başlığı
    @FindBy(id = "trendyol.com:id/editTextAddressName")
    public MobileElement adresBaslikClick;
    @FindBy(id = "trendyol.com:id/textinput_placeholder")
    public MobileElement adresBaslikSendKeys;


    //Hide Keys
    @FindBy(id = "trendyol.com:id/buttonSave")
    public MobileElement kaydetButton;

    @FindBy(id = "trendyol.com:id/textViewPaymentTypes")
    public MobileElement gelAlIptal;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.View[2]")
    public MobileElement krediKartiNo;
    public void erkekButtonClick(){erkekButton.click();}
    public void kesfetKapatClick(){kesfetKapat.click();}
    public void accountTabClick(){hesabimTab.click();}
    public void cancelDefaultAccountClick(){defaultAccount.click();}
    public void emailTextBox(String str){emailText.sendKeys(str);}
    public void passwordTextBox(String str) {passwordText.sendKeys(str);}
    public void girisYapButtonClick(){girisYapButton.click();}
    public void anasayfaTabClick(){anaysayfaTab.click();}
    public void searchContainerClick(){searchContainer.click();}
    public void searchTextBox(String str){searchTextBox.sendKeys(str);}
    public void suggestTextClick(){suggestedText.click();}
    public void sepeteEkleButtonClick(){sepeteEkleButton.click();}
    public void closeSepetUyariClick(){closeSepetUyari.click();}
    public void sepetimTabClick(){sepetimTab.click();}
    public void sepetiOnaylaClick(){sepetiOnayla.click();}
    public void krediKartBox(String str){cardNumber.sendKeys(str);}


    @Test
    public void test(){

        Driver.getAppiumDriver();
        erkekButtonClick();
        ReusableMethods.bekle(2);
        kesfetKapatClick();
        anasayfaTabClick();
        searchContainerClick();
        searchTextBox("logitech mx keys");
        suggestTextClick();
        ReusableMethods.bekle(2);
        ReusableMethods.scrollDownByCoordinates(540,540,1400,500);
        logitech.click();
        ReusableMethods.bekle(2);
        closeSepetUyari.click();
        sepetimTabClick();
        //Driver.getAppiumDriver().navigate().back();
        /*
        Dimension dim = Driver.getAppiumDriver().manage().window().getSize();
        int height = dim.getHeight();
        int width = dim.getWidth();
        int startX = width/2; // başlangıç noktası ekranın tam ortası
        int endX =  width/2; // sağa sola swipe olmicağı için bitiş noktası da width/2
        int startY =(int) (height * 0.4);
        int endY = (int) (height * 0.2);

            touchAction = new TouchAction<>(Driver.getAppiumDriver());
            touchAction.press(PointOption.point(startX,startY)).
                        waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000))).
                        moveTo(PointOption.point(endX,endY)).
                        release().
                        perform();

         */


    }
}
