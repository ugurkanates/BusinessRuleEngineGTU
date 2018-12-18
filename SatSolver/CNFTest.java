import org.junit.Test;
import static org.junit.Assert.*;

public class CNFTest {

    public CNFTest() {

    }

    @Test
    public void test_cnfFormat(){

        System.out.println("cnfFormat");

        CNF cnf_1 = new CNF("(-45,21,78).(-35,45).(10)");
        CNF cnf_2 = new CNF("(45)");
        CNF cnf_3 = new CNF("(10.45)!(-bc)");
        CNF cnf_4 = new CNF("");
        CNF cnf_5 = new CNF("()");

        assertEquals(cnf_1.cnfFormat(),true);
        assertEquals(cnf_2.cnfFormat(),true);
        assertEquals(cnf_3.cnfFormat(),false);
        assertEquals(cnf_4.cnfFormat(),false);
        assertEquals(cnf_5.cnfFormat(),false);
    }

    @Test
    public void test_checkingClause(){
        System.out.println("checkingClause");
        CNF cnf = new CNF();
        assertEquals(cnf.checkingClause("(34,48,59)"),true);
        assertEquals(cnf.checkingClause("(,23,94)"),false);
        assertEquals(cnf.checkingClause("18,39"),false);
    }

    @Test
    public void test_checkingData() {
        System.out.println("checkingData");
        CNF cnf = new CNF();
        assertEquals(cnf.checkingData("1839"),true);
        assertEquals(cnf.checkingData(""),false);
        assertEquals(cnf.checkingData("123a1"),false);
    }

    @Test
    public void test_clearString() throws Exception {
        System.out.println("clearString");
        String var,expected;
        expected ="5548(58)";
        var = "55   48  (   58  ) ";
        CNF cnf = new CNF(var);
        cnf.clearString();
        String result = cnf.getData();
        assertEquals(expected, result);
    }
}