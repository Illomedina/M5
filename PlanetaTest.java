import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetaTest {  

    Planeta Tierra = new Planeta (23, 50, 5, 25, 125);
    Planeta Marte = new Planeta (35, 33, 10, 35, 195);
    Planeta Jupiter = new Planeta (12, 20, 30, 55, 85);
    Planeta Saturno = new Planeta (1, 90, 30, 55, 235);
    Planeta Mercurio = new Planeta (3, 4, 50, 50, 200);   

    @Test 
    public void testConversioKelvin()
    {
        Tierra.conversioKelvin();
        assertEquals(296, Tierra.getTemperaturaMitjana());           
    }    


    @Test 
    public void testPlanetaHabitable()
    {
        Tierra.planetaHabitable();
        Jupiter.planetaHabitable();
        Marte.planetaHabitable();
        Saturno.planetaHabitable();

        assertEquals(1,Tierra.planetaHabitable());
        assertEquals(0, Jupiter.planetaHabitable());
        assertEquals(0, Marte.planetaHabitable());
        assertEquals(0, Saturno.planetaHabitable());
    }


    @Test 
    public void testCalculPes()
    {
        assertEquals(2000,Tierra.calculPes(80));
    }  
    

    @Test 
    public void testPlanetaEquilibrat()
    {
        Tierra.planetaEquilibrat();
        Mercurio.planetaEquilibrat();

        assertEquals(0, Tierra.planetaEquilibrat());
        assertEquals(1, Mercurio.planetaEquilibrat());
    }  
}
