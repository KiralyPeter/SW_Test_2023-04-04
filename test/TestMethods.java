import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Method;
import java.util.ArrayList;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import controllers.MainController;

public class TestMethods {
    ArrayList<String> methodNames;

    @BeforeEach
    public void initList(){
        this.methodNames = new ArrayList<>();
        Method[] methods = MainController.class.getMethods();
        // Tömb bejárása
        // foreEach szerű ciklus
        // method = tömb eleme
        for(Method method: methods){
            this.methodNames.add( method.getName());
           
        }
    }

    @Test
    public void testCalcWeightExist(){
        boolean actual = this.methodNames.contains("calcWeight");
        assertTrue(actual);
    }

    @Test
    public void testStartCalcExist(){
        boolean actual = this.methodNames.contains("startCalc");
        assertTrue(actual);
    }

    @Test
    public void testHandleEventsExist(){
        boolean actual = this.methodNames.contains("handleEvents");
        assertTrue(actual);
    }
    
}
