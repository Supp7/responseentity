package com.sike.exception;


import com.sike.entity.ResponseData;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(NullPointerException.class)
    public ResponseData exception(NullPointerException exception) {
        return new ResponseData("500", "空指针异常",false, null);
    }

    @ExceptionHandler(IndexOutOfBoundsException.class)
    public ResponseData exception(IndexOutOfBoundsException exception) {
        return new ResponseData("500", "数组越界异常", false,null);
    }

    @ExceptionHandler(Exception.class)
    public ResponseData exception(Exception exception) {
        return new ResponseData("500", exception.getMessage(),false, null);
    }



}