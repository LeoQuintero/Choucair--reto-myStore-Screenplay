package co.com.choucair.certification.mystore.stepdefinitions;

import co.com.choucair.certification.questions.Verificar;
import co.com.choucair.certification.tasks.AbrirPagina;
import co.com.choucair.certification.tasks.AgregarAlCarrito;
import co.com.choucair.certification.tasks.IniciarSesion;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class CompraProductoModificadoStepDefinitios {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que Leonardo se encuentra registrado en la pagina web My Store")
    public void queLeonardoSeEncuentraRegistradoEnLaPaginaWebMyStore() {
        OnStage.theActorCalled("Leonardo").wasAbleTo(AbrirPagina.urlApp());

    }

    @When("^el desea iniciar sesion con usuario \"([^\"]*)\" y clave \"([^\"]*)\"$")
    public void elDeseaIniciarSesionConUsuarioYClave(String usuario, String clave) {
        OnStage.theActorInTheSpotlight().attemptsTo((Performable) IniciarSesion.credenciales(usuario, clave));
    }

    @Then("^el comprueba el nombre de usuario (.*) de inicio sesion$")
    public void elCompruebaElNombreDeUsuarioDeInicioSesion(String question) {
        OnStage.theActorInTheSpotlight()
                .should(GivenWhenThen.seeThat(Verificar.toThe(question)));
    }

    @When("el agrega dos productos al carrito de compra modificando la talla")
    public void elAgregaDosProductosAlCarritoDeCompraModificandoLaTalla() {
        OnStage.theActorInTheSpotlight().attemptsTo((Performable) AgregarAlCarrito.producto());
    }

    @And("el realiza el proceso de compra por transferencia bancaria")
    public void elRealizaElProcesoDeCompraPorTransferenciaBancaria() {
        
    }

    @Then("el valida que la compra este realizada")
    public void elValidaQueLaCompraEsteRealizada() {
    }

}

