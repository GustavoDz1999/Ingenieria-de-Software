/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.pruebas;


import ico.fes.playeras.CalculoDeCobro;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author gusdi
 */
public class PruebaCalculoDeCobro {
    private CalculoDeCobro objeto;
    
    public PruebaCalculoDeCobro() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        objeto = new CalculoDeCobro();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    @Test
    public void DosPlayerasTipoUno(){
        objeto.setNumDePlayeras(2);
        objeto.setTipoDePlayera(1);
        double resultado=380;
        assertEquals(resultado, objeto.porcentaje(),0.01);
        
    }
    @Test
    public void CincoPlayerasTipoTres(){
        objeto.setNumDePlayeras(5);
        objeto.setTipoDePlayera(3);
        double resultado=1534.5;
        assertEquals(resultado, objeto.porcentaje(), 0.01);
    }
    
    @Test
    public void OchoPlayerasTipoDos(){
        objeto.setNumDePlayeras(8);
        objeto.setTipoDePlayera(2);
        double resultado=1821.6;
        assertEquals(resultado, objeto.porcentaje(), 0.01);
    }
}
