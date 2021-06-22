package com.study.personal.kafka;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageTest {

    @JsonProperty
    private Long id;

    @JsonProperty
    private String mensagem;

    @JsonCreator
    public MessageTest(@JsonProperty("id") Long id,
                       @JsonProperty("message") String mensagem) {
        this.id = id;
        this.mensagem = mensagem;
    }

    public Long getId() {
        return id;
    }

    public String getMensagem() {
        return mensagem;
    }
}
