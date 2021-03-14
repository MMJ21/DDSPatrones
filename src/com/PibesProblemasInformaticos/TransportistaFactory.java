package com.PibesProblemasInformaticos;

public class TransportistaFactory {

    public static ITransportista crearTransportista(int codigoPostal)
    {
        ITransportista transportista;

        switch(Integer.toString(codigoPostal).charAt(0))
        {
            case '1':
            case '2':
            case '3':
                transportista = new Correos();

                break;
            case '4':
            case '5':
            case '6':
                transportista = new DHL();

                break;
            default:
                transportista = new SEUR();

                break;
        }

        return transportista;
    }
}
