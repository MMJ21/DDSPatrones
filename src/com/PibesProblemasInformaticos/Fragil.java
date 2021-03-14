package com.PibesProblemasInformaticos;

public class Fragil extends DecoradorEnvio {

    public Fragil(Envio envio)
    {
        super(envio);
    }

    public String enviar()
    {
        return this.Envio.enviar() + "\n**FRAGIL**";
    }

    public double coste()
    {
        return this.Envio.coste() + 3.0;
    }

}
