package com.tui.search.composer.exception;

import org.apache.http.HttpStatus;

/**
 * @author praneethkumar.g
 *
 */
public class BadRequestException extends RuntimeException
{

   /** The Constant serialVersionUID. */
   private static final long serialVersionUID = 1L;

   /** The response code. */
   private int responseCode;

   /**
    * Instantiates a new holiday search results api exception.
    *
    * @param message the message
    * @param responseCode the response code
    */
   public BadRequestException(final String message, final Throwable cause, final int responseCode)
   {
      super(message, cause);
      this.responseCode = responseCode;
   }

   /**
    * Instantiates a new holiday search results api exception.
    *
    * @param message the message
    * @param responseCode the response code
    */
   public BadRequestException(final String message, final int responseCode)
   {
      super(message);
      this.responseCode = responseCode;
   }

   /**
    * Instantiates a new holiday search results api exception.
    *
    * @param message the message
    * @param responseCode the response code
    */
   public BadRequestException(final String message)
   {
      super(message);
      this.responseCode = HttpStatus.SC_BAD_REQUEST;
   }

   /**
    * Gets the response code.
    *
    * @return the responseCode
    */
   public int getResponseCode()
   {
      return responseCode;
   }

   /**
    * Sets the response code.
    *
    * @param responseCode the responseCode to set
    */
   public void setResponseCode(final int responseCode)
   {
      this.responseCode = responseCode;
   }
}
