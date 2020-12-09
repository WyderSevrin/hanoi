package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class TourTest {

    Disque d1 = new Disque(1);
    Disque d2 = new Disque(2);
    Disque d3 = new Disque(3);
    Disque d4 = new Disque(4);
    @Test
    /**
     * GIVEN_WHEN_THEN
     */
    public void testEmpiler_TourNonVideAvecDisquePlusPetit_True() {
        Tour t = new Tour(2);
        
        t.empiler(d3);
        boolean expected = true;//On s'attend à ce que ça marche
        boolean actual = t.empiler(d1);
        
        assertEquals(expected, actual);
    }
    
    @Test
    /**
     * ajout à la Tour Non Vide un Disque Plus grand
     */
    public void testEmplielr_TourNonVideEtDisquePlusgrand_False(){
        Tour _TourNonVide = new Tour();
        _TourNonVide.empiler(d1);
        
        boolean expected = false;//On s'attend à ce que ça ne marche pas
        boolean actual = _TourNonVide.empiler(d3);
        assertEquals(expected, actual);
    }
    
    
   
    @Test
    /**
     * empiller un disque sur tour vide
     */
    public void testEmpiler_TourVide_True() {
            Tour t = new Tour();
            
            boolean expected = true;
            boolean result = t.empiler(d1);
            
            assertEquals(expected, result);      
    }
    
    @Test
    /**
     * empiller un disque sur tour plein
     */
    public void testEmpiler_TourPlein_False() {
            Tour t = new Tour();
            
            boolean expected = false;
            t.empiler(d4);
            t.empiler(d3);
            t.empiler(d2);
            boolean result = t.empiler(d1);
            
            assertEquals(expected, result);      
    }

}
