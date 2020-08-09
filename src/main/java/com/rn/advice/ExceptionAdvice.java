package com.rn.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionAdvice {
    @ExceptionHandler(Exception.class)
    public ModelAndView globalExceptionHandler(Exception ex) {
        return new ModelAndView("home", "errorMsg", " Error 404 : Something Went Wrong");
    }
}