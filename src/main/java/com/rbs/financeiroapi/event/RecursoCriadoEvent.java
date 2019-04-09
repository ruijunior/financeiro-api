package com.rbs.financeiroapi.event;

import org.springframework.context.ApplicationEvent;

import javax.servlet.http.HttpServletResponse;

public class RecursoCriadoEvent extends ApplicationEvent {

    private final Long codigo;
    private final HttpServletResponse response;

    public RecursoCriadoEvent(Object source, HttpServletResponse response, Long codigo) {
        super(source);
        this.response = response;
        this.codigo = codigo;
    }

    public Long getCodigo() {
        return codigo;
    }

    public HttpServletResponse getResponse() {
        return response;
    }
}
