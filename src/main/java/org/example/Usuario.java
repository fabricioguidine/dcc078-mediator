package org.example;

public class Usuario implements Destinatario {
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void receberMensagem(String mensagem) {
        System.out.println(nome + " recebeu uma nova mensagem: " + mensagem);
    }
}