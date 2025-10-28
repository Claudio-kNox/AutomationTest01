package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.cdimascio.dotenv.Dotenv;

public class GmailLoginPage {
    WebDriver driver;
    // Utilizar la variable .env
    Dotenv dotenv = Dotenv.load();
    String password = dotenv.get("GMAIL_PASSWORD");

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