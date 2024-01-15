package Pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.time.Duration;
import java.util.List;

public class n11Pages {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By kategorilerbutonu = AppiumBy.xpath("//android.widget.ImageView[@resource-id=\\\"com.dmall.mfandroid:id/navigation_bar_item_icon_view\\\"])[2]");

    By apple = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.dmall.mfandroid:id/listingSuggestionItemNameTV\" and @text=\"Apple\"]");
    By filtrele = AppiumBy.xpath("//android.widget.TextView[@text=\"Filtrele\"]");
    By dahiliHafiza = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.dmall.mfandroid:id/typeNameTV\" and @text=\"Dahili Hafıza\"]");
    By gb = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.dmall.mfandroid:id/nameTV\" and @text=\"128 GB\"]");
    By uygulaButonu = AppiumBy.id("com.dmall.mfandroid:id/applyBtn");
    By model = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.dmall.mfandroid:id/typeNameTV\" and @text=\"Model\"]");

    By iphone = AppiumBy.xpath("(//android.widget.CheckBox[@resource-id=\"com.dmall.mfandroid:id/selectionStatusCB\"])[1]");
    By renk = AppiumBy.xpath("(//android.widget.TextView[@resource-id=\"com.dmall.mfandroid:id/optionTV\"])[10]");
    By mavi = AppiumBy.xpath("(//android.widget.CheckBox[@resource-id=\"com.dmall.mfandroid:id/selectionStatusCB\"])[3]");
    By sonucGoster = AppiumBy.id("com.dmall.mfandroid:id/tv_name");
    By artiButonu = AppiumBy.id("com.dmall.mfandroid:id/ivAddToBasket");

    By continueButonu =AppiumBy.id("com.dmall.mfandroid:id/continueButton");
    By sepetim = AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.dmall.mfandroid:id/navigation_bar_item_small_label_view\" and @text=\"Sepetim\"]");
    By sepetKontrol = AppiumBy.xpath("com.dmall.mfandroid:id/basketItemProductLayout");
    public n11Pages(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper = new ElementHelper(driver);
    }

    public void kategoriTiklama() {
        driver.findElement(kategorilerbutonu).click();
    }

    public void elektronikTiklama() {
        List <WebElement> ListofElement = driver.findElements(AppiumBy.xpath("(//android.widget.ImageView[@resource-id=\"com.dmall.mfandroid:id/ivCategoryItem\"])[2]"));
        ListofElement.get(1).click();
    }

    public void telefonVeAksesuarSecimi() {
        List <WebElement> ListofElement = driver.findElements(AppiumBy.xpath("(//android.widget.ImageView[@resource-id=\"com.dmall.mfandroid:id/ivCategoryItem\"])[2]"));
        ListofElement.get(0).click();
    }

    public void cepTelefonuSecimi() {
        List <WebElement> ListofElement = driver.findElements(AppiumBy.xpath("(//android.widget.ImageView[@resource-id=\"com.dmall.mfandroid:id/ivCategoryItem\"])[1]"));
        ListofElement.get(0).click();
    }

    public void markaSecimi() {
        driver.findElement(apple).click();
    }

    public void filtrelemeTiklama() {
        driver.findElement(filtrele).click();
    }

    public void filtrelemeYap() {
        driver.findElement(dahiliHafiza).click();
        driver.findElement(gb).click();
        driver.findElement(uygulaButonu).click();
        driver.findElement(model).click();
        driver.findElement(iphone).click();
        driver.findElement(uygulaButonu).click();
        driver.findElement(renk).click();
        driver.findElement(mavi).click();
        driver.findElement(uygulaButonu).click();
    }

    public void sonuclariGosterTiklama() {
        driver.findElement(sonucGoster).click();

    }

    public void urunSepeteEkleme() {
        driver.findElement(artiButonu).click();
        driver.findElement(continueButonu).click();
    }

    public void sepeteGit() {
        driver.findElement(sepetim).click();
    }

    public void sepetKontrol() {
        elementHelper.checkVisible(sepetKontrol);
    }
}
