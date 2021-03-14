package com.PibesProblemasInformaticos;

public class Correos implements ITransportista {

    @Override
    public double costeCarta(double peso) {
        return peso * 0.015;
    }

    @Override
    public double costePaquete(double peso) {
        return peso * 0.03;
    }

    @Override
    public double costeGranVolumen(double peso) {
        return peso * 0.035;
    }
}
