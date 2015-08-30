/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicalanalysis;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mrinalini
 */
public class AnalysingDataTest {
    
    public AnalysingDataTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sorting method, of class AnalysingData.
     */
    @Test
    public void testSorting() {
        System.out.println("sorting");
        double[][] record= new double[1][2];
        record[0][0]=0;
        record[0][1]=0;
        AnalysingData result = new AnalysingData();
        result.sorting(record);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
