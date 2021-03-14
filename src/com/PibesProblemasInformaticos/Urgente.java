package com.PibesProblemasInformaticos;

public class Urgente extends DecoradorEnvio {

    public Urgente(Envio envio)
    {
        super(envio);
    }

    public String enviar()
    {
        return this.Envio.enviar() + "\n**URGENTE**";
    }

    public double coste()
    {
        return this.Envio.coste() + 2.0;
    }

}
