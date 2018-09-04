package com.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.http.HttpServletRequest;

@RestControllerAdvice
@RequestMapping(produces = "application/vnd.error+json")
public class GlobalExceptionHandler {

   @ExceptionHandler(ResourceNotFoundException.class)
   public String handleResourceNotFound(ResourceNotFoundException  resourceNotFoundException){

    return resourceNotFoundException.getMessage()+HttpStatus.NOT_FOUND;
   }
  }
