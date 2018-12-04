package com.tui.search.composer.models;

public class ErrorResponse
{
private String message;


private String errorCode;;

private String errorCategory;

private int responseCode;

String reason;

public String getMessage()
{
   return message;
}

public void setMessage(String message)
{
   this.message = message;
}

public int getResponseCode()
{
   return responseCode;
}

public void setResponseCode(int responseCode)
{
   this.responseCode = responseCode;
}

public String getReason()
{
   return reason;
}

public void setReason(String reason)
{
   this.reason = reason;
}

public String getErrorCode()
{
   return errorCode;
}

public void setErrorCode(String errorCode)
{
   this.errorCode = errorCode;
}


/**
 * @return the errorCategory
 */
public String getErrorCategory()
{
   return errorCategory;
}

/**
 * @param errorCategory the errorCategory to set
 */
public void setErrorCategory(String errorCategory)
{
   this.errorCategory = errorCategory;
}

}
