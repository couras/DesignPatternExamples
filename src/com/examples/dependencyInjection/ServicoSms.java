package com.examples.dependencyInjection;

/**
 * Created by ricardo on 2/13/17.
 */
public class ServicoSms implements IServicoMsg {
    @Override
    public void sendMessage(String assunto, String mensagem) {
        System.out.println("SMS-> " + assunto + ": " + mensagem);
    }
}