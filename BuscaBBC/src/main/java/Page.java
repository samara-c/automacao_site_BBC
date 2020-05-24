
import org.openqa.selenium.By;


public class Page { // essa classe declara os Bys

	private By secaoTecnologia = By.linkText("Tecnologia");
	private By palavraChaveCoronaVirus = By.partialLinkText("Corona");
	private By entreEmContatoComABBC = By.linkText("Contate a BBC");
	private By campoNome = By.id("fullName");
	private By campoEmail = By.id("email");
	private By campoCidade = By.id("town");
	private By campoTelefone = By.id("phone");
	
	
	public By getCampoEmail() {
		return campoEmail;
	}


	public void setCampoEmail(By campoEmail) {
		this.campoEmail = campoEmail;
	}


	public By getCampoCidade() {
		return campoCidade;
	}


	public void setCampoCidade(By campoCidade) {
		this.campoCidade = campoCidade;
	}


	public By getCampoTelefone() {
		return campoTelefone;
	}


	public void setCampoTelefone(By campoTelefone) {
		this.campoTelefone = campoTelefone;
	}

	

	public By getCampoNome() {
		return campoNome;
	}


	public void setCampoNome(By campoNome) {
		this.campoNome = campoNome;
	}


	public By getEntreEmContatoComABBC() {
		return entreEmContatoComABBC;
	}


	public void setEntreEmContatoComABBC(By entreEmContatoComABBC) {
		this.entreEmContatoComABBC = entreEmContatoComABBC;
	}


	public By getPalavraChaveCoronaVirus() {
		return palavraChaveCoronaVirus;
	}

	
	public void setPalavraChaveCoronaVirus(By palavraChaveCoronaVirus) {
		this.palavraChaveCoronaVirus = palavraChaveCoronaVirus;
	}

	public By getSecaoTecnologia() {
		return secaoTecnologia;
	}

	public void setSecaoTecnologia(By secaoTecnologia) {
		this.secaoTecnologia = secaoTecnologia;
	}

}