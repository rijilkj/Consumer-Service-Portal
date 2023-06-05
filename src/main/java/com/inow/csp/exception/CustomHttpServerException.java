package com.inow.csp.exception;

import org.springframework.http.HttpStatusCode;

public class CustomHttpServerException extends CustomHttpException {
	private HttpStatusCode status;
    private String errorMessage;

    public CustomHttpServerException(HttpStatusCode httpStatusCode, String errorMessage) {
    	super(httpStatusCode, errorMessage);
        this.status = httpStatusCode;
        this.errorMessage = errorMessage;
    }

    public HttpStatusCode getStatus() {
        return status;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
