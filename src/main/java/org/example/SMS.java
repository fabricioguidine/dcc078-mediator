package org.example;

import java.util.ArrayList;
import java.util.List;
public class SMS implements Mediator {
    private List<Destinatario> destinatarios;

    public SMS() {
        this.destinatarios = new ArrayList<>();
    }

    @Override
    public void enviar(String mensagem, Destinatario destinatario) {
        for (Destinatario d : destinatarios) {
            if (d != destinatario) {
                d.receberMensagem(mensagem);
            }
        }
    }

    @Override
    public void adicionarDestinatario(Destinatario destinatario) {
        this.destinatarios.add(destinatario);
    }
}