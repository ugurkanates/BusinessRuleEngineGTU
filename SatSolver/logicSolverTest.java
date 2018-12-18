import static org.junit.jupiter.api.Assertions.*;

class logicSolverTest {
    private logicSolver obje = new logicSolver();

    @org.junit.jupiter.api.Test
    void theLoop() {
        int expected=2;
        int actual;

        // <<<--------------------- TEST ETTİĞİM YER
        String string2 = "(-23,23,12,3,4,15).(34,-34).(12,-12).(34,-34).(12,-12).(34,-34).(12,-12).(34,-34).(12,-12).(34,-34).(12,-12).(34,-34).(12,-12).(45,44)";
        obje.theLoop(string2);
        actual = obje.checker;
        assertEquals(expected,actual);

        expected = 1;
        String string = "(34,-34).(12,-12)";
        obje.theLoop(string);
        actual=obje.checker;
        assertEquals(expected,actual);

        expected = 0;
        String string3 = "(F).(12,2)";
        obje.theLoop(string3);
        actual=obje.checker;
        assertEquals(expected,actual);
    }

}