package io.zipcoder.tc_spring_poll_application.dto.error;

import java.util.List;
import java.util.Map;

public class ErrorDetail {

    private String title;
    private int status;
    private String detail;
    private long timeStamp;
    private String developerMessage;
    private Map<String, List<ValidationError>> errors;

    /**
     *
     * @return a brief title of the error condition, eg: "Validation Failure" or "Internal Server Error"
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return the HTTP status code for the current request; redundant but useful for client-side error handling
     */
    public int getStatus() {
        return status;
    }


    public void setStatus(int status) {
        this.status = status;
    }

    /**
     *
     * @return A short, human-readable description of the error that may be presented to a user
     */
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     *
     * @return the time in milliseconds when the error occurred
     */
    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     *
     * @return detailed information such as exception class name or a stack trace useful for developers to debug
     */
    public String getDeveloperMessage() {
        return developerMessage;
    }

    public void setDeveloperMessage(String developerMessage) {
        this.developerMessage = developerMessage;
    }


    public Map<String, List<ValidationError>> getErrors() {
        return errors;
    }

    public void setErrors(Map<String, List<ValidationError>> errors) {
        this.errors = errors;
    }
}

