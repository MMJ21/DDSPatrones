package com.PibesProblemasInformaticos;

public class GranVolumen extends Envio{
    public GranVolumen(String direccionOrigen, int codigoPostalOrigen, String direccionDestino, int codigoPostalDestino, double peso, ITransportista transportista) {
        super(direccionOrigen, codigoPostalOrigen, direccionDestino, codigoPostalDestino, peso, transportista);
    }
    public double coste()
    {
        return Transportista.costeGranVolumen(Peso);
    }
}
