package com.PibesProblemasInformaticos;

public class SEUR implements ITransportista {

    @Override
    public double costeCarta(double peso) {
        return peso * 0.01;
    }

    @Override
    public double costePaquete(double peso) {
        return peso * 0.02;
    }

    @Override
    public double costeGranVolumen(double peso) {
        return peso * 0.025;
    }
}
