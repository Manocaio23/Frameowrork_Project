package Steps;

import java.util.Locale;
import static Driver.DriverFactory.pegaDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

import PageObjects.Base_PO;
import PageObjects.GerenciamentoUser_PO;
import Steps.base.Hooks;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;



public class GerenciamentoUserSteps extends Base_PO {
	Faker faker = new Faker(new Locale("pt_BR"));
	
	private GerenciamentoUser_PO gerenciadorUser; 
	
	public GerenciamentoUserSteps(GerenciamentoUser_PO gerenciadorUser) {
		this.gerenciadorUser=gerenciadorUser;
	}
	
	private WebDriver driver=pegaDriver();
	
	

	@Dado("que esteja no Orage")
	public void que_esteja_no_orage() {
		
		gerenciadorUser.acessarPagina();
		
	}

	@Quando("escrevo o Login {string}")
	public void escrevo_o_login(String string) {
		//driver.findElement(By.id("txtUsername")).sendKeys(string);
		//sendKeys(By.id("txtUsername"), string);
		gerenciadorUser.setnomeUsuario_textField(string);
		
	}

	@Quando("a {string}")
	public void a(String string) {
		//driver.findElement(By.id("txtPassword")).sendKeys(string);
		//sendKeys(By.id("txtPassword"), string);
		
		gerenciadorUser.setsenhaUsuario_textField(string);
	}

	@E("clico no botao login")
	public void clico_no_botao_login() {
		//driver.findElement(By.id("btnLogin")).click();
		//EsperaOElementoCarregarClicar(By.id("btnLogin"));
		gerenciadorUser.setBtnLogin();
	}

	@E("visualizo {string}")
	public void visualizo(String string) throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
		
		//WebElement element =
		//		Actions action = new Actions(driver);
//		action.moveToElement(element).perform();
//		Thread.sleep(1000);
//		//driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")).click();
	}

	@Quando("passo o mouse em cima de Administrador")
	public void passo_o_mouse_em_cima_de_administrador() {
		
	}

	@E("visualizo Gerenciamento de usuario")
	public void visualizo_gerenciamento_de_usuario() {
		
	}

	@E("em seguida clico em comercial")
	public void em_seguida_clico_em_comercial() {
		
	}

	@Quando("clico no botao adicionar")
	public void clico_no_botao_adicionar() throws InterruptedException {
		driver.findElement(By.id("btnAdd")).click();
		Thread.sleep(1500);
	}

	@E("seleciono a funcao {string}")
	public void seleciono_a_funcao(String string) {
		WebElement element= driver.findElement(By.id("systemUser_userType"));
		Select select= new Select(element);
		select.selectByVisibleText(string);
	}

	@E("seleciono o funcionario {string}")
	public void seleciono_o_funcionario(String funcionario) {
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(funcionario);
	}

	@E("nome de usuario")
	public void nome_de_usuario() {
		
		String nome= faker.name().fullName();
		//driver.findElement(By.id("systemUser_userName")).sendKeys(nome);
		gerenciadorUser.setEspecificoUsuario(nome);
	}

	@E("situacao {string}")
	public void situacao(String string) {
		//assert equals
	}

	@E("senha {string}")
	public void senha(String string) {
		//driver.findElement(By.id("systemUser_password")).sendKeys(string);
		gerenciadorUser.setEspecificoSenha(string);
	}

	@E("repetir a senha {string}")
	public void repetir_a_senha(String string) {
		//driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(string);
		gerenciadorUser.setEspecificoSenhaRepertir(string);
	}

	@E("clico no botao save")
	public void clico_no_botao_save() throws InterruptedException {
		//driver.findElement(By.id("btnSave")).click();
		gerenciadorUser.setBtnSave();
		Thread.sleep(3000);
	}

	@Entao("devo ver a mensagem que sucesso")
	public void devo_ver_a_mensagem_que_sucesso() {
		//assert equals
		
	}
}
