package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

    @Test
    /**
     * GIVEN_WHEN_THEN
     */
    public void testEmpiler_TourNonVide_avec_DisquePlusPetit() {
        Disque d1 = new Disque(10);
        Disque d3 = new Disque(30);
        Tour t = new Tour(2);
        
        t.empiler(d3);
        boolean expected = true;//On s'attend à ce que ça marche
        boolean actual = t.empiler(d1);
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testEmplielr_TourNonVide_et_DisquePlusgrand(){
        Disque d1 = new Disque(10);
        Disque d3 = new Disque(30);
        
        Tour _TourNonVide = new Tour();
        _TourNonVide.empiler(d1);
        
        boolean expected = false;//On s'attend à ce que ça ne marche pas
        boolean actual = _TourNonVide.empiler(d3);
        assertEquals(expected, actual);
    }
    
    
   
    @Test
    public void testEmpiler_TourVide() {
            Disque d1 = new Disque(1);
            Tour t = new Tour();
            
            boolean expected = true;
            boolean result = t.empiler(d1);
            
            assertEquals(expected, result);      
    }
    
    @Test
    public void testEmpiler_TourPlein() {
            Disque d1 = new Disque(1);
            Disque d2 = new Disque(2);
            Disque d3 = new Disque(3);
            Disque d4 = new Disque(4);
            Tour t = new Tour();
            
            boolean expected = false;
            t.empiler(d1);
            t.empiler(d2);
            t.empiler(d3);
            boolean result = t.empiler(d4);
            
            assertEquals(expected, result);      
    }

}
