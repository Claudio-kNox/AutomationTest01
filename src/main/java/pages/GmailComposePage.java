package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailComposePage {
    WebDriver driver;

    public GmailComposePage(WebDriver driver) {
        this.driver = driver;
    }

    public void redactarCorreo(String destinatario, String asunto, String mensaje) {
        driver.findElement(By.cssSelector(".T-I.T-I-KE.L3")).click(); // Botón redactar
        driver.findElement(By.name("to")).sendKeys(destinatario);
        driver.findElement(By.name("subjectbox")).sendKeys(asunto);
        driver.findElement(By.cssSelector("div[aria-label='Mensaje']")).sendKeys(mensaje);
        driver.findElement(By.cssSelector("div[aria-label='Enviar']")).click();
    }
}
