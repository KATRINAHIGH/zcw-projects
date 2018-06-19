package io.zipcoder.tc_spring_poll_application.exception;

import io.zipcoder.tc_spring_poll_application.dto.error.ErrorDetail;
import io.zipcoder.tc_spring_poll_application.dto.error.ValidationError;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ControllerAdvice
public class RestExceptionHandler {

    @Inject
     private MessageSource messageSource;

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException(
            ResourceNotFoundException rnfe,
            HttpServletRequest request) {
        ErrorDetail customError = new ErrorDetail();
        customError.setDetail(rnfe.getMessage());
        customError.setDeveloperMessage(rnfe.getStackTrace().toString());
        customError.setStatus(404);
        customError.setTimeStamp(new Date().getTime());
        customError.setTitle("Resource Not Found");

        return new ResponseEntity<>(customError, null, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleValidationError(
            MethodArgumentNotValidException manve,
            HttpServletRequest request){
        ErrorDetail customError = new ErrorDetail();

        List<FieldError> fieldErrors =  manve.getBindingResult().getFieldErrors();
        for(FieldError fe : fieldErrors) {

            List<ValidationError> validationErrorList = customError.getErrors().get(fe.getField());
            if(validationErrorList == null) {
                validationErrorList = new ArrayList<>();
                customError.getErrors().put(fe.getField(), validationErrorList);
            }
            ValidationError validationError = new ValidationError();
            validationError.setCode(fe.getCode());
            validationError.setMessage(messageSource.getMessage(fe, null));
            validationErrorList.add(validationError);
        }

        return new ResponseEntity<>(customError, null, HttpStatus.NOT_FOUND);
        }
}


//Create RestExceptionHandler class annotated with @ControllerAdvice
//Create a handler method with the header shown below
// Populate an ErrorDetail object in the method, and
//return a ResponseEntity containing the ErrorDetail and an HTTP NOT_FOUND status
//Use java.util's new Date().getTime() for the timestamp
//Provide the detail and developer messages from the ResourceNotFoundException


//In this handler we need to do the following:
//
// Create the ErrorDetail object (similar to before)
//  Get the list of field validation errors
// For each field error, add it to the appropriate list in the ErrorDetail (see below)
// Return a ResponseEntity containing the error detail and the appropriate HTTP status code (400 Bad Request)

