package com.PibesProblemasInformaticos;

public abstract class DecoradorEnvio extends Envio
{

    protected Envio Envio;

    public DecoradorEnvio(Envio envio)
    {
        this.Envio = envio;
    }

    @Override
    public abstract String enviar();

    @Override
    public abstract double coste();
}
