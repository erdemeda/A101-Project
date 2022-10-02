package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.A101pages;
import utilities.ConfigReader;
import utilities.Driver;
import static utilities.ReusableMethods.*;

public class A101StepDef {

    A101pages a101Page = new A101pages();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    Actions actions = new Actions(Driver.getDriver());
    Faker faker = new Faker();

    @Given("Kullanici {string} ya gider")
    public void kullanici_ya_gider(String A101AnaSayfa) {
        Driver.getDriver().get(ConfigReader.getProperty(A101AnaSayfa));
    }
    @Given("Kullanici Cookiesi kabul eder")
    public void kullanici_cookiesi_kabul_eder() {
        a101Page.cookies.click();
    }
    @Then("Kullanici uyelik olusturmadan Giyim Aksesuardan Kadin Ic Giyim kismini daha sonra Dizalti Corap bolumunu secer")
    public void kullanici_uyelik_olusturmadan_giyim_aksesuardan_kadin_ıc_giyim_kismini_daha_sonra_dizalti_corap_bolumunu_secer() {
        actions.moveToElement(a101Page.giyimAksesuar)
                .perform();
        waitForVisibility(a101Page.dizAltiCorap,3);
        a101Page.dizAltiCorap.click();
    }
    @Then("Siyah corap secer")
    public void siyah_corap_secer() {
        jsClick(a101Page.siyahCorapSecmeButonu);
    }
    @Then("Secilen corabin siyah oldugunu dogrular")
    public void secilen_corabin_siyah_oldugunu_dogrular() {
        waitForVisibility(a101Page.pentiSiyahCorapYazisi,3);
        Assert.assertTrue(a101Page.pentiSiyahCorapYazisi.isDisplayed());
    }
    @Then("Sepete Ekle butonuna tiklar")
    public void sepete_ekle_butonuna_tiklar() {
        a101Page.sepeteEkleButonu.click();
    }
    @Then("Sepeti Goruntule butonuna tiklar")
    public void sepeti_goruntule_butonuna_tiklar() {
        waitForVisibility(a101Page.sepetiGoruntuleButonu,3);
        a101Page.sepetiGoruntuleButonu.click();
    }
    @Then("Sepeti Onayla butonuna tiklar")
    public void sepeti_onayla_butonuna_tiklar() {
        waitForVisibility(a101Page.sepetiOnaylaButonu,3);
        a101Page.sepetiOnaylaButonu.click();
    }
    @Then("Uye Olmadan Devam et butonuna tiklar")
    public void uye_olmadan_devam_et_butonuna_tiklar() {
        waitForVisibility(a101Page.uyeOlmadanDevamEtButonu,3);
        jsClick(a101Page.uyeOlmadanDevamEtButonu);
    }
    @Then("Ekrandaki E-mail kutusuna gecerli bir email girer ve devam et butonuna tiklar")
    public void ekrandaki_e_mail_kutusuna_gecerli_bir_email_girer_ve_devam_et_butonuna_tiklar() {
        waitForVisibility(a101Page.userEmailKutusu,3);
        actions.sendKeys(a101Page.userEmailKutusu,faker.internet().emailAddress())
                .click(a101Page.devamEtButonu)
                .perform();
    }
    @Then("Yeni adres olustur kismina tiklar")
    public void yeni_adres_olustur_kismina_tiklar() {
        a101Page.yeniAdresKutusu.click();
    }
    @Then("Gelen ekrana gecerli adres bilgilerini girer ve Kaydet butonuna tiklar")
    public void gelen_ekrana_gecerli_adres_bilgilerini_girer_ve_kaydet_butonuna_tiklar() {
        waitForVisibility(a101Page.adresBasligiKutusu,3);
        actions.sendKeys(a101Page.adresBasligiKutusu,"Ev adresim")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone())
                .perform();
        Select dropdown = new Select(a101Page.ilKutusu);
        dropdown.selectByVisibleText("ANKARA");
        waitFor(2);
        dropdown = new Select(a101Page.ilceKutusu);
        dropdown.selectByVisibleText("BALA");
        waitFor(2);
        dropdown = new Select(a101Page.mahalleKutusu);
        dropdown.selectByIndex(3);
        actions.sendKeys(a101Page.adresKutusu,faker.address().fullAddress()).perform();
        waitFor(2);
        jsClick(a101Page.kaydetButonu);
    }
    @And("Kargo sirketi secimi yaparak Kaydet ve Devam et butonuna tiklar")
    public void kargoSirketiSecimiYaparakKaydetVeDevamEtButonunaTiklar() {
        waitForVisibility(a101Page.mngKargoButonu,3);
        jsClick(a101Page.mngKargoButonu);
        jsClick(a101Page.kaydetVeDevamEtButonu);
    }
    @And("Kullanici odeme ekranina gidildigini dogrular ve Siparisi Tamamla butonuna tiklar")
    public void kullaniciOdemeEkraninaGidildiginiDogrularVeSiparisiTamamlaButonunaTiklar() {
        waitForVisibility(a101Page.odemeEkrani,3);
        Assert.assertTrue(a101Page.odemeEkrani.isDisplayed());
        jsClick(a101Page.siparisiTamamlaButonu);
    }
}