package com.PibesProblemasInformaticos;

public class Paquete extends Envio{
    public Paquete(String direccionOrigen, int codigoPostalOrigen, String direccionDestino, int codigoPostalDestino, double peso, ITransportista transportista) {
        super(direccionOrigen, codigoPostalOrigen, direccionDestino, codigoPostalDestino, peso, transportista);
    }
    public double coste()
    {
        return Transportista.costePaquete(Peso);
    }
}
