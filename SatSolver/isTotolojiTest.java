import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by paypaytr on 12/11/18.
 */
class isTotolojiTest {
    @org.junit.jupiter.api.Test
    void theLoop() {
        isTotoloji obje = new isTotoloji();
        String string = "(34).(12,-12)"; //false
        String string2 = "(34,-34).(12,-12)"; //true situtation
        String string3= "(34).(12)"; //false
        String string4 = "(14,41,12),(0)"; //false

        if(obje.theLoop(string))
        System.out.println("false");

        if(obje.theLoop(string2))
        System.out.println("true");

        if(obje.theLoop(string3))
        System.out.println("false");

        if(obje.theLoop(string4))
        System.out.println("false");



    }

    @org.junit.jupiter.api.Test
    void theChecker() {
    }

}
