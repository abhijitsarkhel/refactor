//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.04 at 06:22:11 PM IST 
//


package com.tui.elastic.anite.jaxb.response.calendar;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1
    extends XmlAdapter<String, String>
{


    public String unmarshal(String value) {
        return (com.tui.uk.search.packages.util.XSDateCustomBinder.parseDate(value));
    }

    public String marshal(String value) {
        return (com.tui.uk.search.packages.util.XSDateCustomBinder.printDate(value));
    }

}
