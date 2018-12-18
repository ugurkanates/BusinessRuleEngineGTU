/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relativechecker;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CEM
 */
public class RelativeCheckerTest {
    
    public RelativeCheckerTest() {
    }

    /**
     * Test of main method, of class RelativeChecker.
     */
    @Test
    public void testMain() {
    }

    /**
     * Test of areRelativesCorrect method, of class RelativeChecker.
     */
    @Test
    public void testAreRelativesCorrect() {
        Assert.assertEquals(true,RelativeChecker.areRelativesCorrect("rule.txt", "(46,44,-57,-58,-155,154,153)"));
        Assert.assertEquals(false,RelativeChecker.areRelativesCorrect("rule.txt", "(45,-57,-58,-155,154,153)"));
    }
    
}
