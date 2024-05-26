package pro.sky.skyproStreamAPI.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

public class EmployeeNotFoundException extends RuntimeException {

    public HttpStatusCode getSStatus;

    public EmployeeNotFoundException(String message) {
        super(message);
    }

    public HttpStatus getStatus() {
        return HttpStatus.NOT_FOUND;
    }
}
