package com.pyxius.sample.java8;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDateFormatter {

    private static Logger logger = LoggerFactory.getLogger(MyDateFormatter.class);

    private SimpleDateFormat df;

    public MyDateFormatter(SimpleDateFormat dateFormat){
        this.df = dateFormat;
        df.setLenient(false);
        logger.debug("Initialized with format {}", df.toPattern() );
    }

    public Date formatDate(String dateStr){
        Date date = null;
        try {
            date = df.parse(dateStr);
        }catch(ParseException pe){logger.error("parsing exception in DateFormatter", pe);}
        return date;
    }

    public Date formatDateThrowEx(String dateStr) throws ParseException{
        return df.parse(dateStr);
    }

}
