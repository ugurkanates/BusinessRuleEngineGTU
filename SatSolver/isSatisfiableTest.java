package issatisfiable;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class isSatisfiableTest {

    @Test
    void isCNFSatisfiable() {
        
        //unsatisfiable, NOT cnf
        isSatisfiable isSat = new isSatisfiable("(1,2,3).(1,2,-3).(1,-2,3).(1,-2,-3).(-1,2,3).(-1,2,-3).(-1,-2,3).(-1,-2,-3)",false);
        assertEquals(false, isSat.isCNFSatisfiable());
        System.out.println(isSat.isCNFSatisfiable());

        //unsatisfiable, OK cnf
        isSatisfiable isSat1 = new isSatisfiable("(1,2,3).(1,2,-3).(1,-2,3).(1,-2,-3).(-1,2,3).(-1,2,-3).(-1,-2,3).(-1,-2,-3)",true);
        assertEquals(false, isSat1.isCNFSatisfiable());
        System.out.println(isSat1.isCNFSatisfiable());

        //satisfiable, NOT cnf
        isSatisfiable isSat2 = new isSatisfiable("(1, 2).(-2, -4).(3, 4).(-4, -5).(5, -6).(6, -7).(6, 7).(7, -16).(8, -9).(-8, -14).(9, 10).(9, -10).(-10, -11).(10, 12).(11, 12).(13, 14).(14, -15).(15, 16)",false);
        assertEquals(false, isSat2.isCNFSatisfiable());
        System.out.println(isSat2.isCNFSatisfiable());

        //satisfiable, OK cnf
        isSatisfiable isSat3 = new isSatisfiable("(1, 2).(-2, -4).(3, 4).(-4, -5).(5, -6).(6, -7).(6, 7).(7, -16).(8, -9).(-8, -14).(9, 10).(9, -10).(-10, -11).(10, 12).(11, 12).(13, 14).(14, -15).(15, 16)",true);
        assertEquals(true, isSat3.isCNFSatisfiable());
        System.out.println(isSat3.isCNFSatisfiable());
    }
}
