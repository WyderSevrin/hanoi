package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisqueTest {
	
    Disque dSmall = new Disque(1);
    Disque dMedium = new Disque(2);
    Disque dTall = new Disque(3);

    @Test
    public void testCompareTo() {
            Disque petit = new Disque(1);
            Disque moyen = new Disque(2);
            Disque grand = new Disque(3);
            assertEquals(-1, petit.compareTo(moyen));
            assertEquals(-1, moyen.compareTo(grand));
            //TODO : à compléter
            //Cette méthode n'est pas super, les autres fonctions sont plus efficaces
            assertEquals(-1, petit.compareTo(grand));
            assertEquals(1, grand.compareTo(petit));
            assertEquals(1, moyen.compareTo(petit));
            assertEquals(1, grand.compareTo(moyen));
            assertEquals(0, grand.compareTo(grand));
            assertEquals(0, petit.compareTo(petit));
            assertEquals(0, moyen.compareTo(moyen));
            
    }

    @Test
    /**
     * Compare petit disque et un disque moyen
     */
    public void compareTo_Small_to_Medium(){
            int expected = -1;
            int actual = dSmall.compareTo(dMedium);
            assertEquals(expected, actual);
    }
    
    @Test
    /**
     * Compare disque moyen et un grand disque
     */
    public void compareTo_Medium_to_Tall(){
        int expected = -1;
        int actual = dMedium.compareTo(dTall);
        assertEquals(expected, actual);
    }
    
    @Test
    /**
     * Compare petit disque et un grand disque
     */
    public void compareTo_Small_to_Tall(){
        int expected = -1;
        int actual = dSmall.compareTo(dTall);
        assertEquals(expected, actual);
    }
}
