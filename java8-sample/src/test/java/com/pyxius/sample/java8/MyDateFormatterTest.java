package com.pyxius.sample.java8;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.swing.text.DateFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class MyDateFormatterTest {

    private MyDateFormatter obj;

    @Before
    public void setUp() throws Exception {
        SimpleDateFormat df  = new SimpleDateFormat("dd/MM/yyyy");
        obj = new MyDateFormatter(df);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("No clean up required");
    }

    @Test
    public void formatDatePositive() throws Exception {
        String dateStr = "10/01/2016"; //correct input
        Date date = obj.formatDate(dateStr);
        assertNotNull(date);
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        assertEquals(10, cal.get(Calendar.DAY_OF_MONTH));
        assertEquals(0, cal.get(Calendar.MONTH));
        assertEquals(2016, cal.get(Calendar.YEAR));

    }

    @Test
    public void formatDateNegative() throws Exception {
        String dateStr = "10/26/2016"; //wrong input
        Date date = obj.formatDate(dateStr);
        assertNull(date);
    }

    @Test
    public void formatDateThrowExPositive() throws Exception {
        String dateStr = "10/01/2016"; //correct input
        Date date = obj.formatDateThrowEx(dateStr);
        assertNotNull(date);
    }


    @Test(expected = java.text.ParseException.class)
    public void formatDateThrowExNegative() throws Exception {
        String dateStr = "10/26/2016"; //wrong input
        Date date = obj.formatDateThrowEx(dateStr);
    }

}