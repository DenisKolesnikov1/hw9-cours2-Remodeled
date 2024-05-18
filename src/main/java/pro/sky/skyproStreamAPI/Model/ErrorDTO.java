package pro.sky.skyproStreamAPI.Model;

import org.springframework.http.HttpStatusCode;

public class ErrorDTO {
    public String status;
    public String message;
    public String time;
//    public ErrorDTO ex;
//    public HttpStatusCode getStatus;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
