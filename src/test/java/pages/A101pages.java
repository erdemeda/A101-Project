package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class A101pages {

    public A101pages() {
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath ="//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")
    public WebElement cookies;
    @FindBy(xpath ="(//a[@href='/giyim-aksesuar/'])[1]")
    public WebElement giyimAksesuar;
    @FindBy(xpath ="//a[@href='/giyim-aksesuar/dizalti-corap/']")
    public WebElement dizAltiCorap;
    @FindBy(xpath ="(//a[@href='/giyim-aksesuar/penti-kadin-50-denye-pantolon-corabi-siyah/'])[8]")
    public WebElement siyahCorapSecmeButonu;
    @FindBy(xpath ="(//*[text()='Penti Kadın 50 Denye Pantolon Çorabı Siyah'])[4]")
    public WebElement pentiSiyahCorapYazisi;
    @FindBy(xpath ="//button[@class='add-to-basket button green block with-icon js-add-basket']")
    public WebElement sepeteEkleButonu;
    @FindBy(xpath ="//a[@class='go-to-shop']")
    public WebElement sepetiGoruntuleButonu;
    @FindBy(xpath ="//a[@class='button green checkout-button block js-checkout-button']")
    public WebElement sepetiOnaylaButonu;
    @FindBy(xpath ="//a[@class='auth__form__proceed js-proceed-to-checkout-btn']")
    public WebElement uyeOlmadanDevamEtButonu;
    @FindBy(xpath ="//input[@name='user_email']")
    public WebElement userEmailKutusu;
    @FindBy(xpath ="//button[@class='button block green']")
    public WebElement devamEtButonu;
    @FindBy(xpath ="(//a[@class='new-address js-new-address'])[1]")
    public WebElement yeniAdresKutusu;
    @FindBy(xpath ="//input[@name='title']")
    public WebElement adresBasligiKutusu;
    @FindBy(xpath ="//select[@name='city']")
    public WebElement ilKutusu;
    @FindBy(xpath ="//select[@name='township']")
    public WebElement ilceKutusu;
    @FindBy(xpath ="//select[@name='district']")
    public WebElement mahalleKutusu;
    @FindBy(xpath ="//textarea[@name='line']")
    public WebElement adresKutusu;
    @FindBy(xpath ="//button[@class='button green address-modal-submit-button js-set-country js-prevent-emoji js-address-form-submit-button']")
    public WebElement kaydetButonu;
    @FindBy(xpath ="(//label[@class='js-checkout-cargo-item'])[2]")
    public WebElement mngKargoButonu;
    @FindBy(xpath ="//button[@class='button block green js-proceed-button']")
    public WebElement kaydetVeDevamEtButonu;
    @FindBy(xpath ="//span[contains(text(),'2. ÖDEME SEÇENEKLERİ')]")
    public WebElement odemeEkrani;
    @FindBy(xpath ="//span[@class='order-spinner hidden']")
    public WebElement siparisiTamamlaButonu;

}
