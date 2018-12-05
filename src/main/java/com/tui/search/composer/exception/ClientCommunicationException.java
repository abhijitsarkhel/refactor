package com.tui.search.composer.exception;

public class ClientCommunicationException extends RuntimeException
{
   /** The Constant serialVersionUID. */
   private static final long serialVersionUID = -1001101L;

   /** The response code. */
   private int responseCode;

   /**
    * Instantiates a new holiday search results api exception.
    *
    * @param message the message
    * @param responseCode the response code
    */
   public ClientCommunicationException(final String message, final Throwable cause,
                                       final int responseCode)
   {
      super(message, cause);
      this.responseCode = responseCode;
   }

   public ClientCommunicationException(final String message, final Throwable cause)
   {
      super(message, cause);
   }

   /**
    * Instantiates a new holiday search results api exception.
    *
    * @param message the message
    * @param responseCode the response code
    */
   public ClientCommunicationException(final String message, final int responseCode)
   {
      super(message);
      this.responseCode = responseCode;
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
