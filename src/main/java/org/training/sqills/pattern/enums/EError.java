package org.training.sqills.pattern.enums;

public enum EError {
    SC_BAD_REQUEST(400,"Bad Request"),
    SC_UNAUTHORIZED(401,"Unauthorized"),
    SC_PAYMENT_REQUIRED(402,"Payment Required"),
    SC_FORBIDDEN(403,"Forbidden"),
    SC_NOT_FOUND(404,"Not Found"),
    SC_METHOD_NOT_ALLOWED(405,"Method Not Allowed");

    private final int errorCode;
    private final String errorSummary;

    EError(final int errorCode,
           final String errorSummary) {

        this.errorCode = errorCode;
        this.errorSummary = errorSummary;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorSummary() {
        return errorSummary;
    }
}
