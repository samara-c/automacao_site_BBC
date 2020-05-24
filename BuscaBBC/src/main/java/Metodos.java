import static org.junit.Assert.assertEquals;

public class Metodos {
	
	Page pagina = new Page (); //essa classe declara as acoes a serem executadas
	String tituloNoticia;
	
	public void acessarPaginaTecnologia () {
		
		TesteJUnit.driver.findElement(pagina.getSecaoTecnologia()).click();
		assertEquals("Tecnologia - BBC News Brasil", TesteJUnit.driver.getTitle());
		System.out.println(TesteJUnit.driver.getCurrentUrl());
		
		
	}

	public void encontrarNoticiasSobreOCorona () {
		
			TesteJUnit.driver.findElement(pagina.getPalavraChaveCoronaVirus()).click();
			System.out.println(TesteJUnit.driver.getCurrentUrl());
			tituloNoticia = TesteJUnit.driver.getTitle();
			
			
		
	}
	
	public void acessarPaginaContato () throws Throwable {
			
			TesteJUnit.driver.findElement(pagina.getEntreEmContatoComABBC()).click();
			Thread.sleep(100);
	}
	
	public void preencherCampoNome () {
		
			TesteJUnit.driver.findElement(pagina.getCampoNome()).sendKeys("Jane Doe");
			
	}
	
	public void preencherCampoEmail () {
			
			TesteJUnit.driver.findElement(pagina.getCampoEmail()).sendKeys("jane.doe@gmail.com");
	}
	
	public void preencherCampoEndereco () {
			
			TesteJUnit.driver.findElement(pagina.getCampoCidade()).sendKeys("Sao Paulo - SP");
	}

	public void preencherCampoTelefone () {
		
			TesteJUnit.driver.findElement(pagina.getCampoTelefone()).sendKeys("11 0000-0000");
	}
	
}
