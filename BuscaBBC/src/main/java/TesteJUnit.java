
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TesteJUnit {
	
	Metodos acao = new Metodos();
	Page pagina = new Page();
	String url = "http://www.bbc.com/portuguese/"; // declarando a URL que vou acessar
	public static WebDriver driver; // driver estatico (nao precisa instanciar a classe pra chamar ele)
	

	public static WebDriver driver() { // checando se o driver ja esta ativo
		if (driver == null)
			driver = new ChromeDriver();
		return driver;
	}
	
	
	@Before
	public void setup() {
		try {
		
			System.setProperty("webdriver.chrome.driver", "/home/samara/eclipse-workspace/BuscaBBC/src/main/resources/chromedriver");
			System.out.println("Chrome driver iniciado com sucesso!");
			driver().get(url);
		} catch (Exception e) {
			System.out.println("Não foi possivel iniciar o ChromeDriver");
			e.printStackTrace();
		}
	}

	@Test

	public void realizarTeste () throws Throwable { // puxando da classe metodos o que deve ser feito. so o primeiro metodo do @test funciona
		
		acao.acessarPaginaTecnologia();
		acao.encontrarNoticiasSobreOCorona();
		acao.acessarPaginaContato();
		acao.preencherCampoNome();
		acao.preencherCampoEmail();
		acao.preencherCampoEndereco();
		acao.preencherCampoTelefone();
		
		
		Thread.sleep(10000);
		
		
		

	}
	
	
	@After

	public void fecharDriver() {

		driver.close();

	}

}