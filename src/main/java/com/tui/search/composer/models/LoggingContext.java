package com.tui.search.composer.models;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.tui.uk.search.packages.constants.LogType;

public class LoggingContext implements Serializable
{

   /**
    * Generated serial version UId.
    */
   private static final long serialVersionUID = -6976660551531216709L;
   
   /** The Constant DD_M_MYYYY_H_HMMSS_SSS. */
   private static final String DD_M_MYYYY_H_HMMSS_SSS = "ddMMyyyy_HHmmss_SSS";

   private String siteId;

   private String requestType;

   private String client;

   private LogType logType;
   
   private Date timeStamp;

   public String getSiteId()
   {
      return siteId.toLowerCase();
   }

   public void setSiteId(String siteId)
   {
      this.siteId = siteId;
   }

   public String getRequestType()
   {
      return requestType.toLowerCase();
   }

   public void setRequestType(String requestType)
   {
      this.requestType = requestType;
   }

   public String getClient()
   {
      return client.toLowerCase();
   }

   public void setClient(String client)
   {
      this.client = client;
   }

   public String getLogType()
   {
      return logType.name().toLowerCase();
   }

   public void setLogType(LogType logType)
   {
      this.logType = logType;
   }

   public String getTimeStamp()
   {
      return formatDate(DD_M_MYYYY_H_HMMSS_SSS, timeStamp);
   }

   public void setTimeStamp(Date timeStamp)
   {
      this.timeStamp = timeStamp;
   }
   
   /**
    * Format date.
    *
    * @param format the format
    * @return the string
    */
   private static String formatDate(final String format, final Date date)
   {
      final SimpleDateFormat formatter = new SimpleDateFormat(format);
      return formatter.format(date);
   }

   @Override
   public String toString()
   {
      return "LoggingContext [siteId=" + siteId.toLowerCase() + ", requestType=" + requestType.toLowerCase() + ", client="
         + client.toLowerCase() + ", logType=" + logType.name().toLowerCase() + ", timeStamp=" + getTimeStamp() + "]";
   }

}
