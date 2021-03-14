package com.PibesProblemasInformaticos;

public abstract interface ITransportista {

    public double costeCarta(double peso);

    public double costePaquete(double peso);

    public double costeGranVolumen(double peso);
}
