package com.tui.search.composer.exception;

/**
 * @author praneethkumar.g
 *
 * 
 */
public class InventoryClientException extends RuntimeException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The response code. */
	private String responseCode;

	/** The response code. */
	private String requestType;

	/**
	 * Instantiates a new holiday search results api exception.
	 *
	 * @param message      the message
	 * @param responseCode the response code
	 */
	public InventoryClientException(final String message, final String requestType, final Throwable cause,
			final String responseCode) {
		super(message, cause);
		this.responseCode = responseCode;
		this.requestType = requestType;
	}

	/**
	 * Instantiates a new holiday search results api exception.
	 * 
	 * @param message      the message
	 * @param responseCode the response code
	 */
	public InventoryClientException(final String message, final String requestType, final String responseCode) {
		super(message);
		this.responseCode = responseCode;
		this.requestType = requestType;
	}

	/**
	 * Gets the response code.
	 *
	 * @return the responseCode
	 */
	public String getResponseCode() {
		return responseCode;
	}

	/**
	 * Sets the response code.
	 *
	 * @param responseCode the responseCode to set
	 */
	public void setResponseCode(final String responseCode) {
		this.responseCode = responseCode;
	}

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

}
