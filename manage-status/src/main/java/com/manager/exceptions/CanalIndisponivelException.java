package com.manager.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Canal indisponivel.")
public class CanalIndisponivelException extends Exception {
   
    public CanalIndisponivelException(){
        super("Canal nao disponivel.");
    }
}
