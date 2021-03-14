package com.PibesProblemasInformaticos;

public class Carta extends Envio {
    public Carta(String direccionOrigen, int codigoPostalOrigen, String direccionDestino, int codigoPostalDestino, double peso, ITransportista transportista) {
        super(direccionOrigen, codigoPostalOrigen, direccionDestino, codigoPostalDestino, peso, transportista);
    }
    public double coste()
    {
        return Transportista.costeCarta(Peso);
    }
}
