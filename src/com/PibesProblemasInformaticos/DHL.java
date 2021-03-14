package com.PibesProblemasInformaticos;

public class DHL implements ITransportista {

    @Override
    public double costeCarta(double peso)
    {
        return peso * 0.015;
    }

    @Override
    public double costePaquete(double peso)
    {
        return peso * 0.02;
    }

    @Override
    public double costeGranVolumen(double peso)
    {
        return peso * 0.025;
    }
}
