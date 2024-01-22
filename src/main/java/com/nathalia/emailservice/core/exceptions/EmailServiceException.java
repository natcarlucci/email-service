package com.nathalia.emailservice.core.exceptions;

import com.nathalia.emailservice.application.EmailSenderService;

public class EmailServiceException extends RuntimeException{
    public EmailServiceException(String message){
        super(message);
    }

    public EmailServiceException(String message, Throwable cause){
        super(message, cause);
    }
}