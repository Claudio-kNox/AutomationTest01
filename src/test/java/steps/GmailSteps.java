package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GmailLoginPage;
import pages.GmailComposePage;

public class GmailSteps {
    WebDriver driver;
    GmailLoginPage loginPage;
    GmailComposePage composePage;

    @Given("el usuario accede a Gmail")
    public void accederAGmail() {
        driver = new ChromeDriver();
        driver.get("https://mail.google.com/");
        loginPage = new GmailLoginPage(driver);
        composePage = new GmailComposePage(driver);
    }

    @And("inicia sesión con credenciales válidas")
    public void iniciarSesion() {
        loginPage.ingresarCorreo("knox.automation.test03@gmail.com");
        loginPage.ingresarContraseña(System.getenv("GMAIL_PASSWORD")); // ⚠️ Seguridad
    }

    @When("redacta un correo a {string} con asunto y mensaje")
    public void redactarCorreo(String destinatario) {
        composePage.redactarCorreo(destinatario, "Prueba Automatizada", "Este es un correo de prueba.");
    }

    @Then("el correo se envía correctamente")
    public void verificarEnvio() {
        // Aquí podrías validar que aparece el mensaje "Mensaje enviado"
    }
}

