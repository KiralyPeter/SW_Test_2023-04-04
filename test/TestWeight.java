import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import controllers.MainController;

public class TestWeight {
    
    // Első teszt
    @Test //anotáció, az alatta lévő metódusra van hatása
    public void testCalcWeight01(){
        MainController mc = new MainController();
        double actual = mc.calcWeight(30, 35);
        double expected = 2.6521848951755493;
        assertEquals(expected, actual);

    }

   
}
