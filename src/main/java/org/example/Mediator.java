package org.example;

import java.util.ArrayList;
import java.util.List;
public interface Mediator {
    void enviar(String mensagem, Destinatario destinatario);
    void adicionarDestinatario(Destinatario destinatario);
}