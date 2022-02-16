package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.Veriavel_global;

public class GerenciamentoUser_PO extends Base_PO {
	
	private @FindBy (id="txtUsername")
	WebElement nomeUsuario_TextField;
	
	private @FindBy (id="txtPassword")
	WebElement senhaUsuario_TextField;
	
	private @FindBy (id="btnLogin")
	WebElement BtnLogin;
	
	private @FindBy (id="systemUser_userName")
	WebElement nomeUsuarioCadastro_TextField;
	
	private @FindBy (id="systemUser_password")
	WebElement SenhaEspecifica_TextField;
	
	private @FindBy (id="systemUser_confirmPassword")
	WebElement SenhaEspecificaRepetir_TextField;
	
	private @FindBy (id="btnSave")
	WebElement BtnSave;
	
	public GerenciamentoUser_PO() {
	super();	
	}

	public void acessarPagina() {
		NavegarUrl(Veriavel_global.NEVEGAR_PARA_PAGINA +"/index.php/dashboard");
	}
	
	public void setnomeUsuario_textField(String nomeUser) {
		sendKeys(nomeUsuario_TextField, nomeUser);
	}
	
	public void setsenhaUsuario_textField(String senhaUser) {
		sendKeys(senhaUsuario_TextField, senhaUser);
	}
	
	public void setBtnLogin() {
		EsperaOElementoCarregarClicar(BtnLogin);
	}
	
	public void setEspecificoUsuario(String usuario) {
		sendKeys(nomeUsuarioCadastro_TextField, usuario);
		
	}
	public void setEspecificoSenha(String senha) {
		sendKeys(SenhaEspecifica_TextField, senha);
		
	}
	
	public void setEspecificoSenhaRepertir(String repetisenha) {
	sendKeys(SenhaEspecificaRepetir_TextField, repetisenha); 
	
	}

	public void setBtnSave() {
		EsperaOElementoCarregarClicar(BtnSave);
	}
	
	public void setSucessoCadastro() {
		
	}
	
}
