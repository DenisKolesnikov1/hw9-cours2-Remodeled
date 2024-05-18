package pro.sky.skyproStreamAPI.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import pro.sky.skyproStreamAPI.exception.EmployeeNotFoundException;

import pro.sky.skyproStreamAPI.Model.ErrorDTO;

import java.awt.image.PixelGrabber;
import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<ErrorDTO> generateNotFoundException(EmployeeNotFoundException ex) {

        ErrorDTO errorDTO = new ErrorDTO();
        errorDTO.setMessage(ex.getMessage());
        errorDTO.setStatus(String.valueOf(ex.getStatus().value()));
        errorDTO.setTime(new Date().toString());
        return new ResponseEntity<ErrorDTO>(errorDTO, ex.getStatus());
    }
}
