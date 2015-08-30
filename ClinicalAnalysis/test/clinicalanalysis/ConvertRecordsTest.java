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
public class ConvertRecordsTest {

    private double ValueOne;
    private double ValueTwo;
    public ConvertRecordsTest() {
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
     * Test of convertHeamoglobinValue method, of class ConvertRecords.
     */
    @Test
    public void testConvertHeamoglobinValue() {
        ConvertRecords checkHeamoglobin = new ConvertRecords();
        ValueOne=checkHeamoglobin.convertHeamoglobinValue(14);
        assertTrue(ValueOne==1);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of convertESRValue method, of class ConvertRecords.
     */
    @Test
    public void testConvertESRValue() {
        ConvertRecords checkHeamoglobin = new ConvertRecords();
        ValueTwo=checkHeamoglobin.convertESRValue(15);
        assertTrue(ValueTwo==1);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

}
