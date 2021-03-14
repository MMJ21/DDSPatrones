package com.PibesProblemasInformaticos;

public class ConAcuseDeRecibo extends DecoradorEnvio {

    public ConAcuseDeRecibo(Envio envio)
    {
        super(envio);
    }

    public String enviar()
    {
        return this.Envio.enviar() + "\n**CON ACUSE DE RECIBO**";
    }

    public double coste()
    {
        return this.Envio.coste() + 2.5;
    }

}
