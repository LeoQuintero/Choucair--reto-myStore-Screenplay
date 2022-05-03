package co.com.choucair.certification.mystore.stepdefinitions;

import co.com.choucair.certification.tasks.AbrirPagina;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class CompraProductoModificadoStepDefinitios {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que Leonardo se encuentra registrado en la pagina web My Store")
    public void queLeonardoSeEncuentraRegistradoEnLaPaginaWebMyStore() {
        OnStage.theActorCalled("Leonardo").wasAbleTo(AbrirPagina.urlApp());

    }

    @When("el desea iniciar sesion con usuario \"([^\"]*)\" y clave \"([^\"]*)\"")
    public void elDeseaIniciarSesionConUsuarioYClave(String usuario, String clave) {
    }

    @Then("el comprueba el nombre de usuario de inicio sesion")
    public void elCompruebaElNombreDeUsuarioDeInicioSesion() {
    }

    @When("el agrega dos productos al carrito de compra modificando la talla")
    public void elAgregaDosProductosAlCarritoDeCompraModificandoLaTalla() {
    }

    @And("el realiza el proceso de compra por transferencia bancaria")
    public void elRealizaElProcesoDeCompraPorTransferenciaBancaria() {
    }

    @Then("el valida que la compra este realizada")
    public void elValidaQueLaCompraEsteRealizada() {
    }

}

