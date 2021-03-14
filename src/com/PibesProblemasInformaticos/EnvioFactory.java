package com.PibesProblemasInformaticos;

public class EnvioFactory {

    public static Envio crearEnvio(String direccionOrigen, int codigoPostalOrigen, String direccionDestino, int codigoPostalDestino, double peso, ITransportista transportista)
    {
        if (peso >= 0 && peso <= 100)
        {
            return new Carta(direccionOrigen, codigoPostalOrigen, direccionDestino, codigoPostalDestino, peso, transportista);
        }

        else if (peso <= 200)
        {
            return new Paquete(direccionOrigen, codigoPostalOrigen, direccionDestino, codigoPostalDestino, peso, transportista);
        }

        else
        {
            return new GranVolumen(direccionOrigen, codigoPostalOrigen, direccionDestino, codigoPostalDestino, peso, transportista);
        }
    }
}
