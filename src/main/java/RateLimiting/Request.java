package RateLimiting;

import java.util.UUID;

public class Request {

    UUID requestID;
    String message;

    public Request(String message){
        this.requestID = UUID.randomUUID();
        this.message = message;
    }

    public UUID getRequestID() {
        return requestID;
    }

    public void setRequestID(UUID requestID) {
        this.requestID = requestID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
