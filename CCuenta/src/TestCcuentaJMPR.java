import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;

public class TestCcuentaJMPR {

Ccuenta miCuenta; 
	
	@Before
	public void inicioPruebas(){
		miCuenta= new Ccuenta("Javier","Aznar", 3200, 1);
	}	
	@After
	public void finPruebas(){
		miCuenta=null;
	}
	
	@Test
	public void testcrearCuentaJMPR(){			
		assertNotNull(miCuenta);		
	}

	@Test
	public void testgetSaldoJMPR(){				
		assertEquals(3200,miCuenta.getSaldo(),0);
	}

	@Test
	public void testingresaYsaldoJMPR() throws Exception{
		miCuenta.ingresar(400);
		assertEquals(3600,miCuenta.getSaldo(),0);		
	}

	@Test
	(expected=Exception.class)    //Pruebas para ver que las excepciones  funcionan
	public void testIngresarJMPR() throws Exception{
		miCuenta.ingresar(-600);		
	}
	
	@Test
	public void testRetirarJMPR() throws Exception{
		miCuenta.retirar(600);
		assertEquals(2600,miCuenta.getSaldo(),0);			
	}

	@Test
	(expected=Exception.class)   //Pruebas para ver que las excepciones funcionan
	public void testRetirarPorEncimaJMPR() throws Exception{
		miCuenta.retirar(4000);		
	}

}
