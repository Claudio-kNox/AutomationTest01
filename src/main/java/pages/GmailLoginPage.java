package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailLoginPage {
    WebDriver driver;

    public GmailLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ingresarCorreo(String correo) {
        driver.findElement(By.id("identifierId")).sendKeys(correo);
        driver.findElement(By.id("identifierNext")).click();
    }

    public void ingresarContraseña(String contraseña) {
        driver.findElement(By.name("password")).sendKeys(contraseña);
        driver.findElement(By.id("passwordNext")).click();
    }
}